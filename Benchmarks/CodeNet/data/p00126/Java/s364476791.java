import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				if (i > 0) System.out.println();
				solve();
			}
		}
	}
	void solve() {
		int[][] t = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				t[i][j] = sc.nextInt();
			}
		}
		boolean[][] ng = new boolean[9][9];
		int[] count = new int[10];
		
		// --
		for (int r = 0; r < 9; r++) {
			Arrays.fill(count, 0);
			for (int c = 0; c < 9; c++) {
				count[t[r][c]]++;
			}
			for (int c = 0; c < 9; c++) {
				if (count[t[r][c]] > 1) {
					ng[r][c] = true;
				}
			}
		}
		// |
		for (int c = 0; c < 9; c++) {
			Arrays.fill(count, 0);
			for (int r = 0; r < 9; r++) {
				count[t[r][c]]++;
			}
			for (int r = 0; r < 9; r++) {
				if (count[t[r][c]] > 1) {
					ng[r][c] = true;
				}
			}
		}
		for (int bk = 0; bk < 9; bk++) {
			final int or = bk / 3 * 3, oc = bk % 3 * 3;
			Arrays.fill(count, 0);
			
			for (int in = 0; in < 9; in++) {
				int r = or + in / 3, c = oc + in % 3;
				count[t[r][c]]++;
			}
			
			
			for (int in = 0; in < 9; in++) {
				int r = or + in / 3, c = oc + in % 3;
				if (count[t[r][c]] > 1) {
					ng[r][c] = true;
				}
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(ng[i][j] ? '*':' ');
				System.out.print(t[i][j]);
			}
			System.out.println();
		}
		
	}
}