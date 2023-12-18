import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      int D = Integer.parseInt(st.nextToken());
      long[][] dp = new long[C-A+1][D-B+1];
      int mod = 998244353;
      dp[0][0] = 1;
      for(int i = 1; i <= C-A; i++) {
    	  dp[i][0] = (B*dp[i-1][0])%mod;
      }
      for(int i = 1; i <= D-B; i++){
    	  dp[0][i] = (A*dp[0][i-1])%mod;
      }
      for(int i = 1; i <= C-A; i++) {
    	  for(int j = 1; j <= D-B; j++) {
    		  dp[i][j] = ((A + i)*dp[i][j-1])%mod;
    		  dp[i][j] = ((B + j)*dp[i-1][j] + dp[i][j])%mod;
    		  dp[i][j] = (dp[i][j] - (A+i-1)*(B+j-1)*dp[i-1][j-1])%mod;
    		  dp[i][j] = (dp[i][j] + mod)%mod;
    	  }
      }
      out.println(dp[C-A][D-B]);
      out.close();
   }
}