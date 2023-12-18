import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
			int C = sc.nextInt();
			int R = sc.nextInt();
			if (R == 0) break;
			int[][] a = new int[R][C];
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					char c = sc.next().charAt(0);
					a[i][j] = "RGB".indexOf(c);
				}
			}
			
			int[][] org = copy(a);
			
			int limit = 0;
			for (;;) {
				boolean change = false;
				loop:
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (a[0][0] != a[i][j]) {
							fill(a, 0, 0, a[0][0], a[i][j]);
							limit++;
							change = true;
							break loop;
						}
					}
				}
				if (!change) break;
			}
			
			ans = limit;
			vis = new int[R][C];
			viskey = 1;
			int start = count(org, 0, 0, org[0][0]);
			dfs(0, org[0][0], copy(org), start);
			System.out.println(ans);
		}
	}
	
	
	int ans;
	void dfs(int depth, int prev, int[][] a, int cl) {
		if (cl == a.length * a[0].length) {
			ans = depth;
			return;
		}
		if (depth + 1 >= ans) return;
		for (int i = 0; i < 3; i++) {
			if (i != prev) {
				int[][] b = copy(a);
				fill(b, 0, 0, prev, i);
				++viskey;
				int ncl = count(b, 0, 0, b[0][0]);
				dfs(depth + 1, i, b, ncl);
			}
		}
	}
	
	int[][] copy(int[][] a) {
		int[][] res = new int[a.length][];
		for (int i = 0; i < a.length; i++) res[i] = a[i].clone();
		return res;
	}
	
	int viskey;
	int[][] vis;
	int count(int[][] a, int r, int c, int base) {
		if (0 <= r && r < a.length && 0 <= c && c < a[0].length) {
			if (a[r][c] == base && vis[r][c] != viskey) {
				vis[r][c] = viskey;
				int fl = 1;
				fl += count(a, r + 1, c, base);
				fl += count(a, r - 1, c, base);
				fl += count(a, r, c + 1, base);
				fl += count(a, r, c - 1, base);
				return fl;
			}
		}
		return 0;
	}
	
	void fill(int[][] a, int r, int c, int base, int v) {
		if (0 <= r && r < a.length && 0 <= c && c < a[0].length) {
			if (a[r][c] == base) {
				a[r][c] = v;
				fill(a, r + 1, c, base, v);
				fill(a, r - 1, c, base, v);
				fill(a, r, c + 1, base, v);
				fill(a, r, c - 1, base, v);
			}
		}
	}
	
}