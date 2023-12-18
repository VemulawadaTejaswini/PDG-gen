import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] p = new double[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextDouble();
        }
        double[][] dp = new double[N+1][2*N+1]; //0->-N N->0 2*N -> +N
        dp[0][N] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < 2*N; j++) {
                dp[i+1][j+1] += dp[i][j] * p[i];
                dp[i+1][j-1] += dp[i][j] * (1-p[i]);                
            }
        }
        double ans = 0;
        for (int i = N+1; i < 2*N+1; i++) {
            ans += dp[N][i];
        }
        System.out.println(ans);
    }
}