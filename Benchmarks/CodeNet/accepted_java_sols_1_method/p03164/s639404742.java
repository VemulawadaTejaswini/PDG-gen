import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int weight = sc.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[][] dp = new long[n+1][100001];
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < 100001; j++) {
				dp[i][j] = 92233720368l;
			}
		}
		/*for(int i = 0; i < 100001; i++) {
			dp[0][i] = 0;
		}*/
		dp[0][0] = 0;
		//---------初期設定終了-----------
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 100001; j++) {
				dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				if(j + v[i] <= 100000)dp[i+1][j+v[i]] = Math.min(dp[i+1][j+v[i]], dp[i][j] + w[i]);
			}
		}
		long ans = 0;
		for(int i = 0; i < 100001; i++) {
			if(dp[n][i] <= weight)ans = i;
		}
		System.out.println(ans);
	}
}
