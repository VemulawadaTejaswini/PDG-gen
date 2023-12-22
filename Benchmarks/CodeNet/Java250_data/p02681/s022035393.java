
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();
        String sc = in.next();


        int a = sc.length()-1;


        str =  str + sc.charAt(a);


        if(str.equals(sc))
        {
            System.out.println("Yes");

        }
        else
            {
                System.out.println("No");
            }
    }







    }



