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
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int P = sc.nextInt();
		boolean[][][][] cannot = new boolean[X+2][Y+2][X+2][Y+2];
		for (int p = 0; p < P; p++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			cannot[x1][y1][x2][y2] = true;
			cannot[x2][y2][x1][y1] = true;
		}
		long[][] dp = new long[X+2][Y+2];
		dp[0][0] = 1;
		for (int x = 0; x <= X; x++)
			for (int y = 0; y <= Y; y++) {
				if (!cannot[x+1][y][x][y]) dp[x+1][y] += dp[x][y];
				if (!cannot[x][y+1][x][y]) dp[x][y+1] += dp[x][y];
			}
		if (dp[X][Y] == 0)
			System.out.println("Miserable Hokusai!");
		else
			System.out.println(dp[X][Y]);
	}

}