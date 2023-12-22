

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String arg[]) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = scan.nextInt();
		}

		boolean dp[] = new boolean[k + 1];
		dp[0] = false;
		for (int i = 1; i <= k; i++) {
			boolean win = false;
			for (int j = 1; j <= n; j++) {
				if (a[j] > i) {
					continue;
				}
				if (!dp[i - a[j]]) {
					dp[i] = true;
				}
			}
		}
		if (dp[k]) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}

	}

}
