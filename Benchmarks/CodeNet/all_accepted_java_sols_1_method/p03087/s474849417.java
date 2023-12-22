//package Beginner122;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        String str = s.next();
        int[] ans = new int[n];
        ans[0] = 0;
        for (int i = 1; i < n; i++) {
            if(str.charAt(i) == 'C') {
                if(str.charAt(i - 1) == 'A') {
                    ans[i] = ans[i - 1] + 1;
                } else {
                    ans[i] = ans[i - 1];
                }
            } else {
                ans[i] = ans[i - 1];
            }
        }

        for (int i = 0; i < q; i++) {
            int from = s.nextInt() - 1;
            int to = s.nextInt() - 1;
            System.out.println(ans[to] - ans[from]);
        }
//        System.out.println(Arrays.toString(ans));
    }
}
