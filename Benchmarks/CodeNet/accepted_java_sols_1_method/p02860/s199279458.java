
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       String S = in.next();
       if(N%2!=0)
       {
           System.out.println("No");
       }
        else
            {
                if(S.substring(0 , N/2).equals(S.substring(N/2 , N)))
                {
                    System.out.println("Yes");
                }
                else
                    {
                        System.out.println("No");
                    }
            }
    }

}














