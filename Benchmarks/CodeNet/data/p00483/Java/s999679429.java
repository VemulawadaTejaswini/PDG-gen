
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		h = scanner.nextInt();
		w = scanner.nextInt();
		n = scanner.nextInt();
		map = new char[h][w];
		for (int i = 0; i < h; i++)
			map[i] = scanner.next().toCharArray();
		dp = new int[3][h + 1][w + 1];
		for (int i = 1; i <= h; i++)
			for (int j = 1; j <= w; j++)
				for (int k = 0; k < 3; k++)
					dp[k][i][j] = dp[k][i - 1][j] + dp[k][i][j - 1]
							- dp[k][i - 1][j - 1] + (map[i - 1][j - 1] == c[k] ? 1
							: 0);
		ans = new int[3];
		StringBuilder builder = new StringBuilder();
		while (n-- > 0) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			for (int i = 0; i < 3; i++)
				ans[i] = dp[i][c][d] - dp[i][c][b] - dp[i][a][d] + dp[i][a][b];
			builder.append(ans[0]).append(' ').append(ans[1]).append(' ').append(ans[2]).append('\n');
		}
		System.out.print(builder);
	}

	int w, h, n;
	int[] ans;
	int[][][] dp;
	char[][] map;
	char[] c = { 'J', 'O', 'I' };

}