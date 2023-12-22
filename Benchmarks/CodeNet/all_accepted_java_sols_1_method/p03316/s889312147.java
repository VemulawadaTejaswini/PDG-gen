
import java.util.Scanner;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/6/23 11:55
 * @see meituan.n2018.Bturn
 */
public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int mod = 0;

        int tmp = S;
        while (tmp > 0) {
            mod += tmp % 10;
            tmp /= 10;
        }
        System.out.println(S % mod == 0 ? "Yes" : "No");
    }
}
