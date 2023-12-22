
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch = str.charAt(0); //to check the char placed at index no 0 of the string

        if(isUpperCase(ch)==true) //default function to check whether the given character of the string is uppercase or not
        {
            System.out.println('A');
        }
        else
            {
                System.out.println('a');
            }
            }
    }
