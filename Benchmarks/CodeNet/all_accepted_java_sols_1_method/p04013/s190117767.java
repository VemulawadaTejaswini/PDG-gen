import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] x = new int[n];
		long[][][] dp = new long[n + 1][n + 1][2501];
		for(int i = 0 ; i < n ; i++) x[i] = sc.nextInt();
		dp[0][0][0] = 1;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				for(int k = 0 ; k <= 2500 ; k++) {
//					if(x[i] + k <= 2500) dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
//					else dp[i + 1][j][k] += dp[i][j][k];
					if(x[i] + k <= 2500) {
						dp[i+1][j + 1][k + x[i]] += dp[i][j][k];
					}
					dp[i+1][j][k] += dp[i][j][k];
				}
			}
		}
		long ans = 0;
		for(int i = 1 ; i <= n ; i++) {
			ans += dp[n][i][i * t];
		}
		System.out.println(ans);
	}

}
