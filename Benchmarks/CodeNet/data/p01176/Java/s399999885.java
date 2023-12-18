
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc;
	int memo[];

	int dfs(int p, int p2, int used, int[][] r, int s[], int n) {
		int mi = used;
		if (p2 == n) {
			// System.out.println(Arrays.toString(s));

			return 1;
		}

		if (p == s.length) {
			return 0;
		}

		if (p == p2 && p2 - Integer.highestOneBit(p2) == 0) {
			if (memo[mi] != -1) {
				return memo[mi];
			}
		}

		int o = p - Integer.highestOneBit(p);
		int res = 0;
		if ((Integer.highestOneBit(p) == (Integer.highestOneBit(n)))) {
			if (s.length - n > p - p2) {
				res += dfs(p + 1, p2, used, r, s, n);
			}
		}
		for (int i = 0; i < n; i++) {
			int shi = 1 << i;
			if ((used & shi) != 0) {
				continue;
			}

			if (i >= n || r[s[o]][i] == 1) {
				s[p] = i;
				res += dfs(p + 1, p2 + 1, used | shi, r, s, n);
				s[p] = -1;
			}
		}
		memo[mi] = res;
		return res;
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}
			int r[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					r[i][j] = sc.nextInt();
				}
			}

			int nn = n - 1;
			nn = Integer.highestOneBit(nn) << 1;
			memo = new int[1 << (n)];
			Arrays.fill(memo, -1);
			int[] s = new int[nn];
			Arrays.fill(s, -1);
			s[0] = m - 1;
			int used = 1 << (m - 1);

			int res = dfs(1, 1, used, r, s, n);
			System.out.println(res);
		}
	}

	/**
	 * @param args
	 */

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}