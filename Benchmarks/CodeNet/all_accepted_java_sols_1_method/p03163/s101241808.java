import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] wt = new int[n];
        int[] p  = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
            p[i]  = scanner.nextInt();
        }
        long[][] dp = new long[n+1][w+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(wt[i-1] <= j)
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]] + p[i-1]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][w]);
    }
}
