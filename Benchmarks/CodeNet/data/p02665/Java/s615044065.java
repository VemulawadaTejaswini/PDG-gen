//package javaapplication2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        BigInteger[] arr = new BigInteger[n + 7];
        BigInteger[] cnt = new BigInteger[n + 7];
        for (int i = 0; i <= n; i++) {
            arr[i] = in.nextBigInteger();
        }
        if (n == 0) {
            if (arr[0].equals(1)) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
            System.exit(0);
        }
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                cnt[i] = BigInteger.ONE;
            } else {
                cnt[i] = (cnt[i - 1].subtract(arr[i - 1])).multiply(BigInteger.valueOf(2));
            }
            //System.out.println(cnt[i]);
            if (cnt[i].compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-1");
                System.exit(0);
            }
        }
        if (cnt[n].compareTo(arr[n]) == -1) {
            System.out.println("-1");
            System.exit(0);
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = n; i >= 0; i--) {
            if (i == n) {
                cnt[i] = arr[i];
            } else {
                BigInteger temp = cnt[i + 1].add(arr[i]);
                if (temp.compareTo(cnt[i]) == -1) {
                    cnt[i] = temp;
                }
            }
            //System.out.println(cnt[i]);
            ans = ans.add(cnt[i]);
        }
        System.out.println(ans);
    }

}
