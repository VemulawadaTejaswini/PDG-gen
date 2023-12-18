import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1174/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);

		while (sc.hasNext()) {
			solve();
		}
	}

	int H, W, C;
	void solve() {
		H = sc.nextInt();
		W = sc.nextInt();
		C = sc.nextInt();
		if (H == 0) return;

		int[][] table = new int[H][W];
		for (int h = 0; h < H; h++)
			for (int w = 0; w < W; w++) {
				table[h][w] = sc.nextInt();
			}

		int[][] t = new int[H][W];

		int ans = 0;
		int limit = 6 * 6 * 6 * 6 * 6;
		for (int process = 0; process < limit; process++) {

			for (int h = 0; h < H; h++)
				for (int w = 0; w < W; w++)
					t[h][w] = table[h][w];

			int[] cs = new int[5];
			int p = process;
			for (int i = 0; i < 5; i++) {
				cs[i] = 1 + (p % 6);
				p /= 6;
			}
			if (cs[4] != C) continue;
			if (cs[0] == cs[1] || cs[1] == cs[2] || cs[2] == cs[3] || cs[3] == cs[4]) continue;

			for (int i = 0; i < 5; i++) {
				paint(0, 0, t, cs[i], t[0][0]);
			}
			int cur = count(0, 0, t, C);
			ans = max(ans, cur);
		}
		System.out.println(ans);
	}

	void paint(int r, int c, int[][] t, int updated, int init) {
		if (0 <= r && r < H && 0 <= c && c < W) {
			if (t[r][c] == init && init != updated) {
				t[r][c] = updated;
				paint(r + 1, c, t, updated, init);
				paint(r - 1, c, t, updated, init);
				paint(r, c + 1, t, updated, init);
				paint(r, c - 1, t, updated, init);
			}
		}
	}

	int count(int r, int c, int[][]t, int target) {
		int ans = 0;
		if (0 <= r && r < H && 0 <= c && c < W) {
			if (t[r][c] == target) {
				t[r][c] = -1;
				ans++;
				ans += count(r + 1, c, t, target);
				ans += count(r - 1, c, t, target);
				ans += count(r, c + 1, t, target);
				ans += count(r, c - 1, t, target);
			}
		}
		return ans;
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}