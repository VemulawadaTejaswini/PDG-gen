
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] dp = new int[n + 1][n + 1];
		while (m-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = scanner.nextInt() + 1;
			dp[a][b] = x;
		}
		int ans = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i][j],
						Math.max(dp[i - 1][j], dp[i - 1][j - 1]) - 1);
				if (dp[i][j] > 0)
					ans++;
			}
		System.out.println(ans);
	}
}