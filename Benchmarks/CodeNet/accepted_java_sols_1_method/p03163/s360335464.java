import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] weight = new int[N];
        long[] value = new long[N];
        for(int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextLong();
        }
        long[][] dp = new long[N+1][W+1];
        dp[0][0] = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= W; j++) {
                if(j - weight[i-1] >= 0) dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]] + value[i-1]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[N][W]);
    }
}
