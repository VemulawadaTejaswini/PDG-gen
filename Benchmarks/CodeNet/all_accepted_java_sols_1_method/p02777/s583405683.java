
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        String T = in.next();
        int A = in.nextInt();
        int B = in.nextInt();
        String U = in.next();

        if(S.equals(U))
        {
            System.out.println(A-1);
            System.out.println(B);
        }
        else if(T.equals(U))
        {
            System.out.println(A);
            System.out.println(B-1);
        }
        else
            {
                System.out.println("ERROR");
            }



    }


 }










