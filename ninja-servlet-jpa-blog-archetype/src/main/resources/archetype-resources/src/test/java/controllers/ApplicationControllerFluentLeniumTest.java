#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Copyright (C) 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import static org.junit.Assert.assertTrue;
import ninja.NinjaFluentLeniumTest;

import org.junit.Before;
import org.junit.Test;

public class ApplicationControllerFluentLeniumTest extends NinjaFluentLeniumTest {

    @Test
    public void testThatHomepageWorks() {
        
        goTo("/");
        
        System.out.println("title: " + window().title());
        
        assertTrue(window().title().contains("Home page"));
        
        $("${symbol_pound}login").click();
        
        assertTrue(url().contains("login"));


    }

}
