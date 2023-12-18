import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][3];
		for (int i = 0; i < n; ++i) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			arr[i][2] = scan.nextInt();
		}
		int[][] dp = new int[n][3];
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];

		for (int i = 1; i < n; ++i) {
			for (int j = 0; j < 3; ++j) {
				int max = 0;
				for (int k = 0; k < 3; ++k) {
					if (k != j) {
						max = Math.max(max, dp[i - 1][k] + arr[i][j]);
					}
				}
				dp[i][j] = max;
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans = Math.max(ans, dp[n-1][i]);
		}
		System.out.println(ans);
	}
}
