import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		int A = scanner.nextInt();
		
		int[] card = new int[N];
		
		for (int i = 0; i < N; i++) {
			card[i] = scanner.nextInt();
		}

		long[][][] dp = new long[N+1][N+1][2550];

		dp[0][0][0] = 1;

		//dp[i][j][k]:= i枚目までを見たときにｊ枚選んで合計値をkにする通り数
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N+1; j++) {
				for (int k = 0; k < 2550; k++) {
					if (dp[i][j][k] > 0) {
						//選ばない
						dp[i + 1][j][k] += dp[i][j][k]; 

						//選ぶ
						dp[i + 1][j + 1][k + card[i]] += dp[i][j][k];
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < N+1; i++) {
			ans += dp[N][i][i*A];
		}

		System.out.println(ans - 1);

		scanner.close();
	}

}
