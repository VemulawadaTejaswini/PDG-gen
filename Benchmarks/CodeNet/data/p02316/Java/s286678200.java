import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] v = new int[N+1];
        int[] w = new int[N+1];
        for (int i = 1; i <= N; i++) {
            v[i] = sc.nextInt(); w[i] = sc.nextInt();
        }
        int[][] dp = new int[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                dp[i][j] = dp[i-1][j];
                if(j < w[i])continue;
                if(dp[i][j] < dp[i-1][j-w[i]] + v[i]) dp[i][j] = dp[i-1][j-w[i]] + v[i];
                if(dp[i][j] < dp[i][j-w[i]] + v[i]) dp[i][j] = dp[i][j-w[i]] + v[i];
            }
        }
        System.out.println(dp[N][W]);
        sc.close();

    }

}

