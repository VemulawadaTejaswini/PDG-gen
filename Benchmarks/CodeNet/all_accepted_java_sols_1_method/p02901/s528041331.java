import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			int b = sc.nextInt();
			int x = 0;
			for (int j = 0; j < b; j++) {
				x |= (1 << sc.nextInt() - 1);
			}
			c[i] = x;
		}

		long[] dp = new long[1 << n];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < m; j++) {
				int t = i | c[j];
				if (dp[i] != Long.MAX_VALUE) {
					dp[t] = Math.min(dp[t], dp[i] + a[j]);
				}
			}
		}

		if (dp[(1 << n) - 1] == Long.MAX_VALUE) {
			System.out.println(-1);
			return;
		}

		System.out.println(dp[(1 << n) - 1]);
	}
}
