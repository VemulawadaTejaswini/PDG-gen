//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;


    private void slove() {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long ans = (long)a*c;
        ans = Math.max(ans,(long)b*c);
        ans = Math.max(ans,(long)a*d);
        ans = Math.max(ans,(long)b*d);
        System.out.println(ans);





    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
