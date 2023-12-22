import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
       
      
      int[][] arr = new int[3][n];
      for(int i=0;i<n;i++){
          arr[0][i]=in.nextInt();
          arr[1][i]=in.nextInt();
          arr[2][i]=in.nextInt();
      }
      
      int[][] dp = new int[3][n];
      
      dp[0][0]=arr[0][0];
      dp[1][0]=arr[1][0];
      dp[2][0]=arr[2][0];
      
      for(int i=1;i<n;i++){
         
         dp[0][i]=arr[0][i] + Math.max(dp[1][i-1], dp[2][i-1]);
         dp[1][i]=arr[1][i] + Math.max(dp[0][i-1], dp[2][i-1]);
         dp[2][i]=arr[2][i] + Math.max(dp[0][i-1], dp[1][i-1]);

      }
      
      int ans = Math.max(Math.max(dp[0][n-1], dp[1][n-1]),dp[2][n-1]);
      System.out.print(ans);
      
      
	}
}