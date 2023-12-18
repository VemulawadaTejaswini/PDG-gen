import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			String packageName = new Main().getClass().getPackage().getName();
			System.setIn(new FileInputStream("src/" + packageName + "/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/" + packageName + "/result.txt")));
		} catch (FileNotFoundException e) {
		} catch (NullPointerException e) {
		}
		new Main().run();
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T -- > 0) solve();
	}
	void solve() {
		int n = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] xs = new int[n+1];
		int[] ys = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			xs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
		}

		int[] active = new int[n];
		boolean[][] graph = new boolean[n][n];
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				int d = (xs[i] - xs[j]) * (xs[i] - xs[j]) + (ys[i] - ys[j]) * (ys[i] - ys[j]);
				if (d <= 50 * 50) {
					graph[i-1][j-1] = true;
				}
			}

		for(int i = 1; i <= n; i++) {
			int j = 0;
			int d = (xs[i] - xs[j]) * (xs[i] - xs[j]) + (ys[i] - ys[j]) * (ys[i] - ys[j]);
			if (d <= 10 * 10) {
				active[i - 1] = 1;
			}
		}

		if (Y < X)
		{
			boolean run = false;
			for (int i = 0; i < n; i++) if (active[i] == 1) {
				for (int j = 0; j < n; j++) if (i != j && active[j] != 1) {
					if (graph[i][j]) run = true;
				}
			}
			if (run)
				System.out.println("You're always welcome!");
			else {
				int on = 0;
				for (int i = 0; i < n; i++) if (active[i] == 1) on++;
				if (on == 0)
					System.out.println(0);
				else
					System.out.println(X);
			}
		}
		else
		{
			int turn = 0;
			for (turn = 0; ; turn++) {
				boolean update = false;

				int[] next = active.clone();
				for (int i = 0; i < n; i++) if (active[i] == 1) {
					update = true;
					next[i] = 2;
					for (int j = 0; j < n; j++) if (i != j && graph[i][j] && active[j] == 0) {
						next[j] = 1;
					}
				}
				active = next;
				if (!update) break;
			}
			System.out.println(X * (turn));
		}

	}
}