import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {
	static private Scanner sc = new Scanner(System.in);
	static int TC;
	public static void main(String[] args) {
		TC = sc.nextInt();
		for (int i = 0; i < TC; i++) {
			read();
			solve();
		}
	}
	
	static int gx,gy;
	static int M;
	static int[][] W;
	
	public static boolean read() {
		gx = sc.nextInt();
		gy = sc.nextInt();
		M = sc.nextInt();
		W = new int[gy * 2 + 1][gx * 2 + 1];
		for(int i =0; i < M; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if (x1 == x2) {
				for (int y = 1; y < max(y1, y2) + 1; y += 2)
					W[y][x1] = 1;
			} else {
				for (int x = 1; x < max(x1, x2) + 1; x += 2)
					W[y1][x] = 1;				
			}
			
		}

		return true;
	}
	
	public static void solve() {
		int[][] dp = new int[gy * 2 + 1][gx * 2 + 1];
		for (int i = 2; i < gx * 2 + 1; i += 2) {
			if (W[0][i - 1] == 1) {
				dp[0][i] = 0;
			} else {
				dp[0][i] = 1;
			}
		}
		for (int i = 2; i < gy * 2 + 1; i += 2) {
			if (W[i - 1][0] == 1) {
				dp[i][0] = 0;
			} else {
				dp[i][0] = 1;
			}
		}
		
		for (int i = 2; i < gy * 2 + 1; i += 2) {
			for (int j = 2; j < gx * 2 + 1; j += 2) {
				dp[i][j] = 0;
				if (W[i - 1][j] == 0) dp[i][j] += dp[i - 2][j];
				if (W[i][j - 1] == 0) dp[i][j] += dp[i][j - 2];
			}
		}
		if (dp[gy * 2][gx * 2] == 0) {
			System.out.println("Miserable Hokusai!");
		} else {
			System.out.println(dp[gy * 2][gx * 2]);
		}
	}
}