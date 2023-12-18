import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();
		System.out.println(LIS(n,a));
	}
	private int LIS(int n, int[] a) {
		int[] dp = new int[n];
		dp[0] = a[0];
		int lis = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] < dp[0]) {
				dp[0] = a[i];
			} else if (a[i] > dp[lis]) {
				lis++;
				dp[lis] = a[i];
			} else {
				dp[findPos(dp, lis, a[i])] = a[i];
			}
 		}
		return lis + 1;
	}
	private int findPos(int[] dp, int lis, int target) {
		int i = 0;
		int j = lis;
		while (i <= j) {
			int guessIdx = i + (j - i) / 2;
			int guessValue = dp[guessIdx];
			if (guessValue == target) {
				return guessIdx;
			}
			if (guessValue < target) {
				i = guessIdx + 1;
			} else {
				j = guessIdx - 1;
			}
		}
		if (dp[i] < target) return i + 1;
		return i;
	}
}
