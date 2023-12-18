// いちいち全部ソートしなくてもいいのでは？（＞Д＜）

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[100010];
        int[] b = new int[100010];
        int[] numA = new int[2];
        int[] numB = new int[2];
        int[] cntA = new int[2];
        int[] cntB = new int[2];

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (i % 2 == 0) {
                a[tmp] += 1;
                if (cntA[0] < a[tmp]) {
                    cntA[0] = a[tmp];
                    numA[0] = tmp;
                } else if (cntA[1] < a[tmp]) {
                    cntA[1] = a[tmp];
                    numA[1] = tmp;
                }
            } else {
                b[tmp] += 1;
                if (cntB[0] < b[tmp]) {
                    cntB[0] = b[tmp];
                    numB[0] = tmp;
                } else if (cntB[1] < b[tmp]) {
                    cntB[1] = b[tmp];
                    numB[1] = tmp;
                }
            }
        }

        int ans = n;
        if (numA[0] != numB[0]) {
            ans -= cntA[0] + cntB[0];
        } else {
            if (cntA[0] - cntA[1] > cntB[0] - cntB[1])
                ans -= cntA[0] + cntB[1];
            else
                ans -= cntA[1] + cntB[0];
        }

        System.out.println(ans);
    }
}