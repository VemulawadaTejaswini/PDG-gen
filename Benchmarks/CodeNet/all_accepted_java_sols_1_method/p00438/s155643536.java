import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A == 0) break;
			int N = sc.nextInt();
			boolean[][] stop = new boolean[B + 1][A + 1];
			for (int i = 0; i < N; ++i) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				stop[y - 1][x - 1] = true;
			}
			int[][] dp = new int[B + 1][A + 1];
			dp[0][0] = 1;
			for (int i = 0; i < B; ++i) {
				for (int j = 0; j < A; ++j) {
					if (!stop[i + 1][j]) dp[i + 1][j] += dp[i][j];
					if (!stop[i][j + 1]) dp[i][j + 1] += dp[i][j];
				}
			}
			System.out.println(dp[B - 1][A - 1]);
		}
	}
}