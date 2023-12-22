
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N+1];
        int[] v = new int[N+1];
        for(int k = 0; k < N; k++) {
            w[k] = sc.nextInt();
            v[k] = sc.nextInt();
        }

        long[][] dp = new long[N+1][W+1];
        Arrays.fill(dp[0],0);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= W; j++) {
                if(j < w[i]) {
                    dp[i+1][j] = dp[i][j];
                } else {
                    dp[i+1][j] = Math.max(v[i] + dp[i][j - w[i]], dp[i][j]);
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}
