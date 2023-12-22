import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] p = new double[n+1];
		p[0] = 0;
		for (int i = 1; i < n+1; i++) {
			p[i] = sc.nextDouble();
		}
		double[][] dp = new double[n+1][n+1];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+1; j++) {
				if(j > i) dp[i][j] = 0;
				else {
					dp[i+1][j] += dp[i][j]*(1-p[i+1]);
					dp[i+1][j+1] += dp[i][j]*p[i+1];
				}
			}
		}
		double ans = 0;
		for (int i = (n+1)/2; i < n+1; i++) {
			ans += dp[n][i];
		}
		System.out.println(ans);
		sc.close();
	}
}