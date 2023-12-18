import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] P = new double[N+1];
        for(int i = 1; i <= N; i++) P[i] = sc.nextDouble();
        double[][] dp = new double[N+1][N/2 +1];
        dp[0][0] = 1;
        for(int i = 1; i <= N; i++){
            for(int j = 0; j <= N/2; j++){
                dp[i][j] += dp[i-1][j] * P[i];
                if(j > 0) dp[i][j] += dp[i-1][j-1] * (1 - P[i]);
            }
        }
        double ans = 0;
        for(int j = 0; j <= N/2; j++){
            ans += dp[N][j];
        }
        System.out.println(ans);
        sc.close();

    }

}
