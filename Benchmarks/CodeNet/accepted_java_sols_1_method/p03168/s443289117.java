import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] P = new double[N];
        for(int i=0;i<N;i++){
            P[i] = sc.nextDouble();
        }
        double[][] dp = new double[N + 1][N + 1];
        dp[0][0] = 1.0;
        for(int j=1;j<N+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<N+1;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j] = dp[i - 1][j] * (1 - P[i - 1]);
                }else{
                    dp[i][j] = dp[i - 1][j - 1] * P[i - 1] + dp[i - 1][j] * (1 - P[i - 1]);
                }
            }
        }
        double sum = 0;
        for(int i=(N/2)+1;i<N+1;i++){
            sum += dp[N][i];
        }
        System.out.println(sum);
    }
}