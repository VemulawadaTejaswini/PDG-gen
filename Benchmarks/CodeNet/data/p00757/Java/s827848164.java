import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1176/input.txt"));
			//System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	int [][] table;
	int R, C, S, K;

	int psum[][];
	int range(int r1, int c1, int r2, int c2) {
		return psum[r2][c2] - psum[r1][c2] - psum[r2][c1] + psum[r1][c1];
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		for (;sc.hasNext();) {
			R = sc.nextInt();
			C = sc.nextInt();
			S = sc.nextInt();
			if (R == 0) break;
			table = new int[R][C];

			psum = new int[R+1][C+1];
			for (int r = 0; r < R; r++)
				for (int c = 0; c < C; c++)
					table[r][c] = sc.nextInt();

			for (int r = 0; r < R; r++)
				for (int c = 0; c < C; c++)
					psum[r+1][c+1] = psum[r+1][c] + psum[r][c+1] - psum[r][c] + table[r][c];

			solve();
		}
	}

	final long mask = (1L << 31) - 1;
	long dp[][][][];
	long dp(int r1, int c1, int r2, int c2) {
		if (dp[r1][c1][r2][c2] != 0)
			return dp[r1][c1][r2][c2];
		long best_g = 1;
		long best_k = range(r1, c1, r2, c2);

		long res = (best_g << 31) + best_k;
		for (int r = r1 + 1; r < r2; r++) {
			long p1 = dp(r1, c1, r, c2);
			long p2 = dp(r, c1, r2, c2);

			long cur_g = (p1 + p2) >> 31;
			long cur_k = min(p1 & mask, p2 & mask);
			if (cur_k >= K)
				res = max(res, (cur_g << 31) + cur_k);
		}

		for (int c = c1 + 1; c < c2; c++) {
			long p1 = dp(r1, c1, r2, c);
			long p2 = dp(r1, c, r2, c2);

			long cur_g = (p1 + p2) >> 31;
			long cur_k = min(p1 & mask, p2 & mask);
			if (cur_k >= K)
				res = max(res, (cur_g << 31) + cur_k);
		}

		return dp[r1][c1][r2][c2] = res;
	}
	void solve(){
		int total = range(0,0,R,C);
		K = total - S;
		dp = new long[R][C][R+1][C+1];
		long res = dp(0,0,R,C);

		long best_g = res >> 31;
		long best_k = res & ((1 << 31) - 1);
		System.out.println(best_g + " " + (S - total + best_k));
		return;
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}