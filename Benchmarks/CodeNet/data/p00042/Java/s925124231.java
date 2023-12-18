import java.util.Scanner;

public class Main {
	static int W, N;
	static int w[], v[];
	static int loop = 0;
	static int dp[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			loop++;
			W = sc.nextInt();
			if (W == 0)
				break;
			N = sc.nextInt();
			w = new int[N+1];
			v = new int[N+1];
			sc.nextLine();
			for (int i = 1; i <= N; i++) {
				String str = sc.nextLine();
				String s[] = str.split("\\,");
				v[i] = Integer.parseInt(s[0]);
				w[i] = Integer.parseInt(s[1]);
			}
			int value = dp();
			int weight = 0;
			int v = -1;;
			for (int i = 0; i <= W; i++) {
				if (dp[N][i] > v) {
					v = dp[N][i];
					weight = i;
				}
			}
			System.out.println("Case " + loop + ":");
			System.out.println(value);
			System.out.println(weight);
		}

	}

	private static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	private static int dp() {
		dp = new int[N + 1][W + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (w[i] > j)
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
			}
		}
		return dp[N][W];
	}
}