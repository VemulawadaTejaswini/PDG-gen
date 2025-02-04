import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A = sc.nextInt();
			
			int[] x = new int[N];
			for(int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
			}
			long[][][] dp = new long[N+1][N+1][2501]; // N枚のカードを使って  合計がNになる組み合わせ
			for(int i = 0; i < N+1; i++) {
				dp[i][0][0] = 0;
			}
			dp[0][0][0] = 1;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < 2501; k++) {
						if(x[i] + k <= 2500) {
							dp[i+1][j + 1][k + x[i]] += dp[i][j][k];
						}
						dp[i+1][j][k] += dp[i][j][k];
					}
				}
			}
			long sum = 0;
			for(int i = 1; i <= N; i++) {
				if(A * i <= 2500) {
						sum += dp[N][i][A * i];
				}
			}
			System.out.println(sum);
			
			
			
		}

		

}
