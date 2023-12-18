
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = scanner.nextInt();
		long[][] dp = new long[n][21];
		dp[1][num[0]] = 1;
		for (int i = 1; i < n - 1; i++)
			for (int j = 0; j <= 20; j++) {
				int a = j + num[i];
				int b = j - num[i];
				if (a <= 20)
					dp[i + 1][a] += dp[i][j];
				if (b >= 0)
					dp[i + 1][b] += dp[i][j];
			}
		System.out.println(dp[n - 1][num[n - 1]]);
	}
}