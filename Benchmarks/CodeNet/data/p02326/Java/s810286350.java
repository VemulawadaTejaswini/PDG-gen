import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] tile = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				tile[i][j] = sc.nextInt();
			}
		}
		
		int[][] dp = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (tile[i][j] == 1) dp[i][j] = 0;
				else dp[i][j] = 1;
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (dp[i][j] == 0) continue;
				if (i == 0 && j == 0) continue;
				if (i == 0) dp[i][j] = dp[i][j - 1] + 1;
				else if (j == 0) dp[i][j] = dp[i - 1][j] + 1;
				else dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
			}
		}
		
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		
		System.out.println(max * max);
	}
}