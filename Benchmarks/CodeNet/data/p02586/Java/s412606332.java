import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		long val[][] = new long[R][C];
		for(int k = 0 ; k < K; ++k){
			int r = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			long v = sc.nextLong();
			val[r][c] = v;			
		}
		long prev[] = new long[C];
		for(int i = 0 ; i < R ; ++i){
			long dp[][] = new long[C][4];
			for(int j = 0 ; j < C ; ++j){				
				dp[j][0] = prev[j];
				dp[j][1] = prev[j] + val[i][j];
				if(j > 0){
					dp[j][0] = Math.max(dp[j][0], dp[j - 1][0]);
					dp[j][1] = Math.max(dp[j - 1][0] + val[i][j] , dp[j][1]);
					dp[j][1] = Math.max(dp[j - 1][1], dp[j][1]);
					dp[j][2] = Math.max(dp[j - 1][2], dp[j - 1][1] + val[i][j]);
					dp[j][3] = Math.max(dp[j - 1][3], dp[j - 1][2] + val[i][j]);
				}
				prev[j] = Math.max(Math.max(dp[j][0], dp[j][1]) , Math.max(dp[j][2], dp[j][3]));
			}
		}
		System.out.println(prev[C - 1]);
	}
}
