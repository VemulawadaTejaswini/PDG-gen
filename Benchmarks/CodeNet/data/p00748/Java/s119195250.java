import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	final int MAX = 1000 * 1000;
	final int INF = 1 << 29;
	int dp[];
	int dp2[];

	void init() {
		dp = new int[MAX + 1];
		dp2 = new int[MAX + 1];
		Arrays.fill(dp, INF);
		Arrays.fill(dp2, INF);
		// dp[i][j] i番目までのtetraの和でjを作る時の最小個数
		// dp[i+1][j] = Math.min(dp[i][j],dp[i][j-tetra[i+1]]+1);
		dp[0] = 0;
		dp2[0] = 0;
		for (int i = 1;; i++) {
			int tetra = i * (i + 1) * (i + 2) / 6;
			if (tetra > MAX)
				break;
			for (int j = 1; j <= MAX; j++) {
				if (j - tetra < 0)
					continue;
				dp[j] = Math.min(dp[j], dp[j - tetra] + 1);
				if (tetra % 2 != 0) {
					dp2[j] = Math.min(dp2[j], dp2[j - tetra] + 1);
				}
			}
		}
	}

	void run() {
		init();

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println(dp[n] + " " + dp2[n]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}