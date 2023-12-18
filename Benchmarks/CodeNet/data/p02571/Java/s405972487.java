//package src.com.jetman.atcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    private void slove() {
        String s = sc.next();
        String t = sc.next();

        int slen = s.length();
        int tlen = t.length();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= slen-tlen; i++) {
            int tmp = 0;
            for (int j = 0; j < tlen; j++) {
                if (s.charAt(i+j) != t.charAt(j)) {
                    tmp++;
                }
            }
                ans = Math.min(ans,tmp);
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
