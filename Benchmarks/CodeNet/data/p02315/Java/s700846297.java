import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] argv) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);

        int[] v = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            v[i] = Integer.parseInt(str[0]);
            w[i] = Integer.parseInt(str[1]);
        }

        int[][] dp = new int[n+1][W+1];
        for(int i=0; i<n+1; i++) dp[i][0] = 0;
        for(int i=0; i<W+1; i++) dp[n][i] = 0;

        for(int i=n-1; i>=0; i--){
            for(int j=W; j>=0; j--){
                if(w[i] > j){
                    dp[i][j] = dp[i+1][j];
                } else {
                    dp[i][j] = Integer.max(dp[i+1][j], dp[i+1][j-w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[0][W]);

    }
}