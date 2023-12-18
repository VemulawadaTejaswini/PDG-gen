import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int M = -Integer.MAX_VALUE / 2;
			if (n == 0) return;
			int[] a = new int[n];
			int[] dp = new int[n];
			for (int i = 0; i < n; i++) a[i] = sc.nextInt();
			Arrays.fill(dp, M);
			dp[0] = a[0];

			for (int i = 1; i < n; i++) {
				dp[i] = Math.max(dp[i - 1] + a[i], a[i]);
				M = Math.max(M, dp[i]);
			}
			System.out.println(M);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}