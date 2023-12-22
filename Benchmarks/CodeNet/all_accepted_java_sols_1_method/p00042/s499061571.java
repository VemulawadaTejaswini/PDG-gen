import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int w[];
	static int v[];
	static int n;
	static int dp[];
	static int d;

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		while (true) {
			d = sc.nextInt();
			if (d == 0)
				break;
			n = sc.nextInt();
			dp = new int[d + 1];
			w = new int[n];
			v = new int[n];
			for (int i = 0; i < n; i++) {
				String tmps[] = sc.next().split(",");
				v[i] = Integer.parseInt(tmps[0]);
				w[i] = Integer.parseInt(tmps[1]);
			}
			// dp[x] x::持てる量
			Arrays.fill(dp, -1);
			dp[0] = 0;
			for (int i = 0; i < n; i++) {
				for (int j = d; j >= w[i]; j--) {
					if (dp[j - w[i]] >= 0)
						dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
				}
			}
			int max_v = 0;
			int min_w = d;
			for (int i = 0; i < d + 1; i++) {
				if (dp[i] > max_v) {
					max_v = dp[i];
					min_w = i;
				}
			}
			System.out.println("Case " + c + ":");
			System.out.println(max_v);
			System.out.println(min_w);
			c++;

		}
	}
}