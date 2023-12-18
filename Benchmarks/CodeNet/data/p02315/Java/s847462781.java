import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] v = new int[N];
		int[] w = new int[N];

		for (int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}

		sc.close();

		int[][] dp = new int[N + 1][W + 1]; // dp[i][weight] iより前までで、重さwightとなるように選んだ時の最大のv

		for (int i = 0; i < N; i++) {

			for (int weight = 0; weight <= W; weight++) {
				dp[i + 1][weight] = dp[i][weight];
				if (weight - w[i] >= 0) {
					dp[i + 1][weight] = Math.max(dp[i + 1][weight], dp[i][weight - w[i]] + v[i]);
				}
			}

		}

		out.println(dp[N][W]);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

