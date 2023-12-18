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
        long s = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        long ans = 0;
        if (s/d > k) {
            ans = s - (k*d);
        } else {
            if (s%d == 0) {
                ans = (k-(s/d))%2==0 ? 0 : d;
            } else {
                ans = (k-(s/d))%2==0 ? s%d : d-(s%d);
                ans = Math.min(ans,(k-(s/d)-1)%2==0 ? d-(s%d) : Long.MAX_VALUE);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
