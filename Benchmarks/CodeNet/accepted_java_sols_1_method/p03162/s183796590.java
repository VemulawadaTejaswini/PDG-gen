
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int c[][] = new int[3][n];

		for (int i = 0; i < n; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int k = scn.nextInt();
			c[0][i] = a;
			c[1][i] = b;
			c[2][i] = k;
		}
		int dp[][] = new int[3][n];
		dp[0][0] = c[0][0];
		dp[1][0] = c[1][0];
		dp[2][0] = c[2][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				dp[j][i] = Math.max(dp[j][i], Math.max(dp[(j + 1) % 3][i - 1], dp[(j + 2) % 3][i - 1]) + c[j][i]);
			}
		}
		int ans = Math.max(dp[0][n - 1], Math.max(dp[1][n - 1], dp[2][n - 1]));

		System.out.println(ans);

	}

}