import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int w = in.nextInt();
       
      int[] wa = new int[n];
      long[] va = new long[n];
      
      for(int i=0;i<n;i++){
         wa[i]=in.nextInt();
         va[i]=in.nextInt();
      }
      
      long[][] dp = new long[n+1][w+1];
      
      for(int i=1;i<=n;i++){
          for(int j=1;j<=w;j++){
            
            dp[i][j]=dp[i-1][j];
            
            if(j>=wa[i-1]){
                 dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-wa[i-1]]+va[i-1]);
            }
          }
      }
      
      System.out.print(dp[n][w]);
      
      
	}
}