// https://beta.atcoder.jp/contests/agc029/submissions/3795448

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String[] ss = new String[n];
        int a = 0;
        long b = 0;

        for (int i = 0; i < n; i++) {
            ss[i] = s.substring(i, i + 1);
        }

        for (int j = 0; j < n; j++) {
            if ("W".equals(ss[j])) {
                a ++;
                b = b + (j + 1);
            }
        }
       

        long wa = 0;
        for (int k = 0; k <= a; k++) {
            wa = wa + k;
        }
        
        System.out.println(b - wa);
    }

}
