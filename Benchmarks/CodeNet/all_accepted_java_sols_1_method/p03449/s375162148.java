import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] dp = new int[2][N];
		int[][] table = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				table[i][j] = input.nextInt();
			}
		}
		dp[0][0] = table[0][0];
		for (int i = 1; i < N; i++) {
			dp[0][i] = dp[0][i-1]+table[0][i];
		}
		dp[1][0] = dp[0][0]+table[1][0];
		for (int i = 1; i < N; i++) {
			dp[1][i] = Math.max(dp[1][i-1], dp[0][i])+table[1][i];
		}
		System.out.println(dp[1][N-1]);
	}
}