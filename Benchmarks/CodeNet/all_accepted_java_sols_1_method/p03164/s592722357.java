import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] wt = new int[n];
        int[] v = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++){
            wt[i] = sc.nextInt();
            v[i] = sc.nextInt();
            total += v[i];
        }

        long[][] dp = new long[n+1][total+1];

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < total+1; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][0] = 0;

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < total+1; j++){
                dp[i][j] = Math.min(dp[i-1][j],j-v[i-1] >= 0 ? dp[i-1][j-v[i-1]]+wt[i-1] : Integer.MAX_VALUE);
            }
            dp[i][v[i-1]] = Math.min(dp[i][v[i-1]],wt[i-1]);
        }

        long val = 0;

        for(int i = 0; i < total+1; i++){
            if(dp[n][i] <= w)
                val = i;
        }

        System.out.println(val);
    }
}
