import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxW = sc.nextInt();
		int weight[] = new int[num];
		long value[] = new long[num];
		for(int i = 0; i < num; i ++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextLong();
		}

		long dp[][] = new long[num + 1][maxW + 1];
		for(int i = 0; i <= num; i ++) {
			dp[i][0] = 0;
		}
		for(int j = 0; j <= maxW; j ++) {
			dp[0][j] = 0;
		}
		for(int i = 1; i <= num; i ++) {
			for(int j = 1; j <= maxW; j ++) {
				if(j < weight[i - 1]) {
					dp[i][j] = dp[i - 1][j];
				}else {
					dp[i][j] = Math.max(dp[i - 1][j - weight[i - 1]] + value[i - 1], dp[i - 1][j]);
				}
			}
		}

		long max = 0;
		for(int i = 0; i <= num; i ++) {
			for(int j = 0; j <= maxW; j ++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}
}