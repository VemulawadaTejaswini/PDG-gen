
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		l = scanner.nextInt();
		turara = new int[n + 2];
		for (int i = 1; i <= n; i++)
			turara[i] = scanner.nextInt();
		dp = new int[n + 1];
		Arrays.fill(dp, -1);

		int ret = 0;
		for (int i = 1; i <= n; i++) {
			if (dp[i] != -1)
				ret = Math.max(ret, dp[i]);
			else
				ret = Math.max(ret, slove(i));
		}
		System.out.println(ret);
	}

	private int slove(int idx) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(idx);
		int ret = 0;
		while (!deque.isEmpty()) {
			int x = deque.peek();
			if (turara[x] < turara[x + 1]) {
				if (dp[x + 1] != -1)
					ret = Math.max(ret, dp[x + 1]);
				else {
					deque.push(x + 1);
					continue;
				}
			}
			if (turara[x] < turara[x - 1]) {
				if (dp[x - 1] != -1)
					ret = Math.max(ret, dp[x - 1]);
				else {
					deque.push(x - 1);
					continue;
				}
			}
			ret = dp[x] = ret + (l - turara[x]);
			deque.poll();
		}
		return ret;
	}

	int[] dp, turara;
	int n, l;

}