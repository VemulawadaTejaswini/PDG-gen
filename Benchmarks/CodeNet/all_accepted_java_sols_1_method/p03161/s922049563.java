import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) x[i] = sc.nextInt();
		long[] dp = new long[n];
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			long min = Long.MAX_VALUE;
			for (int j = 1; j <= k && i - j >= 0; j++) {
				long t = dp[i - j] + Math.abs(x[i - j] - x[i]);
				if (t < min) min = t;
			}
			dp[i] = min;
		}
		System.out.println(dp[n-1]);
	}
}
