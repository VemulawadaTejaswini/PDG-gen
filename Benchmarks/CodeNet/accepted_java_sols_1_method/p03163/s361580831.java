import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,maxW;
        n = sc.nextInt();
        maxW = sc.nextInt();
        int weights[] = new int[n+1];
        int values[] = new int[n+1];

        for(int i=1;i<=n;i++){
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        long dp[][] = new long[n+2][maxW+1];

        for(int i=n;i>=1;i--){
            for(int j=1;j<=maxW;j++){
                if(j >= weights[i]){
                    dp[i][j] = Math.max(values[i] + dp[i+1][j-weights[i]], dp[i+1][j]);
                }
                else{
                    dp[i][j] = dp[i+1][j];
                }
            }
        }

        System.out.println(dp[1][maxW]);
    }
}