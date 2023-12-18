
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        for(int i = 0; i<S.length(); i++)
        {
            int x = S.charAt(i) + N;
            char c = (char) (((S.charAt(i) - (int) 'A') + N) % 26 + (int) 'A');
            System.out.print((char) c);
        }



    }

}













