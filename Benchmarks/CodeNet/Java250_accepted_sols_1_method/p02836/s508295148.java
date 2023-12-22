
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int X  = S.length()/2;
        int Y  = S.length();
        int count = 0;
        for(int i = 0; i<X; i++)
        {
            Y--;
            if(S.charAt(i)!=S.charAt(Y))
            {
                count++;
            }

        }
            System.out.println(count);



    }

}













