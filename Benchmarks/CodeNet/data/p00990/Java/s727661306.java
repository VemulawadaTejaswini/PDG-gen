
import java.io.IOException;
import java.util.Scanner;

import sun.launcher.resources.launcher;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] id = scanner.next().toCharArray();
		int m = scanner.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++)
			a[i] = scanner.nextInt();
		int[][] dp = new int[10][n + 1];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 10; j++) {
				if (id[n - i - 1] == '*')
					for (int k = 0; k < m; k++)
						dp[(j + slove(i, a[k])) % 10][i + 1] += dp[j][i];
				else
					dp[(j + slove(i, id[n - i - 1])) % 10][i + 1] += dp[j][i];
			}
		System.out.println(dp[0][n]);
	}

	private int slove(int p, int i) {
		int j = i * 2;
		return (p % 2 == 1) ? j / 10 + j % 10 : i;
	}
}