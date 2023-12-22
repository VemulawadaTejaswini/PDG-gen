
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean x =false;

        for(int i = 0 ; i<str.length() ; i++)
        {


            if(str.charAt(i)=='7')
            {
                x = true;
            }

        }

            if(x == true)
            {
                System.out.println("Yes");
            }
            else
                {
                    System.out.println("No");
                }




 }

    }


    





