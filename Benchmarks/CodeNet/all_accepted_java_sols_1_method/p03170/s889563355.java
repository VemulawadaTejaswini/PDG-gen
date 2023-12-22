import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		boolean[] dp = new boolean[K + 1];
		Arrays.fill(dp, true);
		dp[0] = false;

		for (int i = 1; i <= K; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] > i) continue;
				dp[i] &= dp[i - a[j]];
			}
			dp[i] = !dp[i];
		}

		if (dp[K]) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}
}
