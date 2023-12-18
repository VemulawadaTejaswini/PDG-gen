import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] memo = new int[45];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int q = Integer.parseInt(in.nextLine());
		for (int i = 0; i < q; i++) {
			String X = in.nextLine();
			String Y = in.nextLine();
			System.out.println(lcs(X, Y));
		}
	}
	static int lcs(String X, String Y) {
		int dp[][] = new int[X.length()+1][Y.length()+1];
		for (int i = 0; i < X.length()+1; i++) {
			Arrays.fill(dp[i], 0);
		}
		for (int i = 1; i < X.length()+1; i++) {
			for (int j = 1; j < Y.length()+1; j++) {
				int a = dp[i-1][j];
				int b = dp[i][j-1];
				int c = dp[i-1][j-1];
				if (X.charAt(i-1) == Y.charAt(j-1)) c++;
				if (a > b) {
					if (a > c) {
						dp[i][j] = a;
					} else {
						dp[i][j] = c;
					}
				} else {
					if (b > c) {
						dp[i][j] = b;
					} else {
						dp[i][j] = c;
					}
				}
			}
		}
		return dp[X.length()][Y.length()];
	}
}

