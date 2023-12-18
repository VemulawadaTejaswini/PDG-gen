
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();



        int a = str.length()- 1;



        char ch = str.charAt(a);


        if(ch=='2'|| ch=='4'|| ch=='5' || ch=='7' || ch=='9')
        {
            System.out.println("hon");
        }

        else if(ch=='0' || ch=='1' || ch=='6' || ch=='8')
        {
            System.out.println("pon");
        }

        else if(ch=='3')
        {
            System.out.println("bon");
        }



    }







    }




