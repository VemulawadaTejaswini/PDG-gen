import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         double arr[] = new double[n];
         for(int i=0;i<n;i++) arr[i] = sc.nextDouble();
         int m = (n+1)/2;
        double dp[][] = new double[n+1][m+1];
        for(int i=1;i<=n;i++) dp[i][0] = 1;
        for(int j=1;j<=m;j++) dp[0][j] = 0;
        dp[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j] =  arr[i-1] * dp[i-1][j-1] + (1 - arr[i-1]) * dp[i-1][j];
            }
        }

        System.out.print(dp[n][m]);
    }
}