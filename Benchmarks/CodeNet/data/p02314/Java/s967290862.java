import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] c = new int[M];
		for(int i=0;i<M;i++) c[i] = sc.nextInt();
		Arrays.sort(c);
		
		int[][] dp = new int[M+1][N+1];
		for(int i=0;i<=M;i++) for(int j=0;j<=N;++j) dp[i][j] = Integer.MAX_VALUE;
		dp[0][0] = 0;
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;++j){
				dp[i+1][j] = dp[i][j];
				if(j<=c[i]){
					dp[i+1][j] = Math.min(dp[i+1][j], Math.min(dp[i][j-c[i]]+1, dp[i+1][j-c[i]]+1));
				}
			}
		}
		System.out.println(dp[M][N]);
		return;
	}
}
