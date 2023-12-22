import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String []s = br.readLine().split(" ");
 
 
        double []pi = new double[N];

        for(int i=0; i < N; ++i)
            pi[i] = Double.parseDouble(s[i]);


        double [][]dp = new double[N+1][N+1];

        for(int i=0; i <= N; ++i)
            for(int j=0; j < i+1; ++j) {
                if (i == 0)
                    dp[i][j] = 1.0;
                else if (j == 0)
                    dp[i][j] = dp[i-1][j] * (1.0 - pi[i-1]);
                else
                    dp[i][j] = dp[i-1][j] * (1.0 - pi[i-1]) + dp[i-1][j-1] * pi[i-1];
            }

        double ans = 0;

        for(int i = (N+1)/2; i <= N; ++i)
            ans += dp[N][i];
        System.out.println(ans);
    }
}