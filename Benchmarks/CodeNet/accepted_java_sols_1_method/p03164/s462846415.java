import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        long maxW;
        n = sc.nextInt();
        maxW = sc.nextLong();
        long weights[] = new long[n+1];
        int values[] = new int[n+1];

        for(int i=1;i<=n;i++){
            weights[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }

        int maxVal = n * 1000;
        long dp[][] = new long[n+2][maxVal+1];

        for(int i=1;i<=maxVal;i++){
            dp[n+1][i] = (long) (1e9 + 1);
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=maxVal;j++){
                dp[i][j] = dp[i+1][j];
                if(j-values[i] >= 0){
                    dp[i][j] = Math.min(dp[i][j],weights[i]+dp[i+1][j-values[i]]);
                }
            }
        }

        long ans = 0;
        for(int i=0;i<=maxVal;i++){
            if(maxW >= dp[1][i]){
                ans = i;
            }
        }

        System.out.println(ans);

    }
}