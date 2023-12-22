import java.util.Scanner;

import static java.lang.Math.max;


public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        long[] weight = new long[n + 1];
        long[] value = new long[n + 1];
        long[] dp = new long[w + 1];
        for (int i = 1; i <= n; i++) {
            weight[i] = scan.nextLong();
            value[i] = scan.nextLong();
        }

        // dp[i][j]  表示选到第i个物品时剩余j容量的最大价值
        for (long i = 1; i <= n; i++) {
            for (long j = w; j >= 0; j--) {
                if(j >= weight[(int)i]) {
                    dp[(int)j] = max(dp[(int)j], dp[(int)(j-weight[(int)i])] + value[(int)i]);
                } else {
                }
            }
        }
        System.out.println(dp[w]);
    }


}