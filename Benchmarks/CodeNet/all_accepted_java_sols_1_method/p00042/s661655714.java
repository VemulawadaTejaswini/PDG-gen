import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(sc.hasNext()) {
			int W = sc.nextInt();
			if(W == 0) break;
			int N = sc.nextInt();
			int[] dp = new int[W + 1];
			int[] v = new int[N];
			int[] w = new int[N];
			Arrays.fill(dp, -1);
			dp[0] = 0;
			for(int i = 0; i < N; i++) {
				String[] s = sc.next().split(",");
				v[i] = Integer.parseInt(s[0]);
				w[i] = Integer.parseInt(s[1]);
			}
			for(int i = 0; i < N; i++) {
				for(int j = W; j >= 0; j--) {
					if(dp[j] != -1 && j + w[i] <= W) {
						int t = w[i] + j;
						dp[t] = Math.max(dp[t], dp[j] + v[i]);
					}
				}
			}
			int wei = 0;
			int val = 0;
			for(int i = 0; i <= W; i++) {
				if(val < dp[i]) {
					wei = i;
					val = dp[i];
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
