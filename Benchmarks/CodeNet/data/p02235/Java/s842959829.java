import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println(solve(sc.nextLine(), sc.nextLine()));
		}
	}
	
	public static int solve(String x, String y) {
		int[][] dp = new int[x.length() + 1][y.length() + 1];
		for (int i = 1; i <= x.length(); i++) {
			for (int j = 1; j <= y.length(); j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				if (x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
				}
			}
		}
		return dp[x.length()][y.length()];
	}
}