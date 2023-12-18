import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt(), W = scanner.nextInt();

		char[][] map = new char[H][];

		for (int i = 0; i < H; i++) {

			map[i] = scanner.next().toCharArray();

		}

		int[][] dp = new int[H][W];

		for (int i = 1; i < H; i++) {

			dp[i][0] = map[i][0] - '0' + dp[i - 1][0];
		}
		for (int i = 1; i < W; i++) {

			dp[0][i] = map[0][i] - '0' + dp[0][i - 1];
		}

		for (int i = 1; i < H; i++) {
			for (int j = 1; j < W; j++) {
				dp[i][j] = (map[i][j] - '0') + Math.min(dp[i][j - 1], dp[i - 1][j]);
			}
		}

		System.out.println(dp[H - 1][W - 1]);
	}
}