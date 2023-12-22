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
		
		long[][] dp = new long[n+1][weight+1];
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < weight + 1; j++) {
				dp[i][j] = 0;
			}
		}
		//ーーーーーここまでで入力と初期化完了ーーーーーーーーーー
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < weight; j++) {
				dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
				if(j+w[i] <= weight)dp[i+1][j+w[i]] = Math.max(dp[i+1][j+w[i]], dp[i][j] + v[i]); 
			}
		}
		long ans = 0;
		for(int i = 1; i < weight + 1; i++) {
			ans = Math.max(ans, dp[n][i]);
		}
		System.out.println(ans);
	}
}
