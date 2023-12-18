import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(sc.hasNext()) {
			int W = sc.nextInt();
			if(W == 0) break;
			int N = sc.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];
			for(int i = 0; i < N; i++) {
				String[] s = sc.next().split(",");
				v[i] = Integer.parseInt(s[0]);
				w[i] = Integer.parseInt(s[1]);
			}
			int[][] dp = new int[N + 1][W + 1];
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= W;  j++) {
					dp[i][j] = -1;
				}
			}
			dp[0][0] = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= W; j++) {
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
					int t = j + w[i];
					if(dp[i][j] != -1 && t <= W) {
						dp[i + 1][t] = Math.max(dp[i + 1][j], dp[i][j] + v[i]);
					}
				}
			}
			int wei = 0;
			int val = 0;
			for(int i = 0; i <= W; i++) {
				if(val < dp[N][i]) {
					val = dp[N][i];
					wei = i;
				}
			}
			System.out.printf("Case %d:\n", cnt);
			System.out.println(val);
			System.out.println(wei);
			cnt++;
		}
		sc.close();
	}
}
