import java.util.*;
import java.io.*;
class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String []s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);

        int []weigths = new int[N];
        long []values = new long[N];
        

        for(int i=0; i < N; ++i) {
            s = br.readLine().split(" ");
            weigths[i] = Integer.parseInt(s[0]);
            values[i] = Integer.parseInt(s[1]);
        }



        long [][]dp = new long[N+1][W+1];

        for(int i=0; i <= N; ++i)
            dp[i][0] = 0;

        for(int i=0; i <= W; ++i)
            dp[0][i] = 0;

        for(int i=1; i <= N; ++i)
            for(int j=1; j <= W; ++j) {
                if (j - weigths[i-1] >= 0)
                    dp[i][j] = Math.max(dp[i-1][j], values[i-1] + dp[i-1][j - weigths[i-1]]);
                else dp[i][j] = dp[i-1][j];
            }

        System.out.println(dp[N][W]);
    }
}