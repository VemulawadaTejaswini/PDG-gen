import java.util.*;

public class Main {
    static int n;
    static int w;
    static long[] value;
    static long[] weight;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        w = sc.nextInt();
        weight = new long[w+1];
        value = new long[n+1];
        dp = new long[n+1][w+1];

        for (int i=0; i<n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        //dp[i][sum_w]にはi番目までの中でsum_wまでの重さが入る最大値が入る。
        for (int i=0; i<n; i++) {
            for (int sum_w=0; sum_w <=w; sum_w++) {
                if (sum_w - weight[i] >= 0) {
                    dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w - (int)weight[i]] + value[i]);
                }
                dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w]);
            }
        }
        System.out.println(dp[n][w]);
    }
}