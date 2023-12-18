
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		l = scanner.nextInt();
		turara = new int[n];
		for (int i = 0; i < n; i++)
			turara[i] = scanner.nextInt();
		dp = new int[n];
		Arrays.fill(dp, -1);
		int ret = 0;
		for (int i = 0; i < n; i++)
			ret = Math.max(ret, slove(i));
		System.out.println(ret);
	}

	private int slove(int idx) {
		if (dp[idx] != -1)
			return dp[idx];
		int ret = 0;
		if (idx > 0 && turara[idx - 1] > turara[idx])
			ret = Math.max(ret, slove(idx - 1));
		if (idx < n - 1 && turara[idx + 1] > turara[idx])
			ret = Math.max(ret, slove(idx + 1));
		return dp[idx] = ret + (l - turara[idx]);
	}

	int[] dp, turara;
	int n, l;

}