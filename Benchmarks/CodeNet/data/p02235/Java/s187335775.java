import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String s1 = reader.readLine();
			String s2 = reader.readLine();
			System.out.println(LCS(s1.toCharArray(), s2.toCharArray()));
		}
		reader.close();
	}

	private int LCS(char[] s1, char[] s2) {
		int n1 = s1.length;
		int n2 = s2.length;
		int[][] dp = new int[n1+1][n2+1];
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n2; j++) {
				char c1 = s1[i-1];
				char c2 = s2[j-1];
				if (c1 == c2) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}			
		}
		return dp[n1][n2];
	}
}
