import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        
        while (true) {
            String S;
            int m;
            S = sc.next();
            if (S.equals("-"))
                break;
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int h;
                h = sc.nextInt();
                String res;
                res = S.substring(h, S.length());
                res += S.substring(0, h);
                S = res;
            }
            System.out.println(S);
        }

    }
  
}
