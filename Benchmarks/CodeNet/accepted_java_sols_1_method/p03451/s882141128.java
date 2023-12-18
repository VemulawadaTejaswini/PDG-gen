import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		int[][] dp = new int[2][n];

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		dp[0][0] = a[0][0];
		dp[1][0] = dp[0][0] + a[1][0];


		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < n; j++) {
				dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + a[i][j]);
				if(i == 1) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + a[i][j]);
					dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + a[i][j]);
				}
			}
		}

		System.out.println(dp[1][n - 1]);

		sc.close();
	}
}
