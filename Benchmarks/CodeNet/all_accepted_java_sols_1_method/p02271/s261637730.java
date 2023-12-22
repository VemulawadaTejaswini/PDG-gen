
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int q = in.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = in.nextInt();
		}

		// solve
		boolean[][] dp = new boolean[n+1][2001];
		dp[0][0] = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2001; j++) {
				if (a[i] <= j) {
					dp[i+1][j] = dp[i][j-a[i]] | dp[i][j];
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}

		for (int i = 0; i < q; i++) {
			if (dp[n][m[i]]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

}

