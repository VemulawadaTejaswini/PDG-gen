import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		TreeSet<Integer> xset = new TreeSet<Integer>();
		TreeSet<Integer> yset = new TreeSet<Integer>();
		for (int i = 0; i < N; ++i) {
			X[i] = Integer.parseInt(sc.next());
			Y[i] = Integer.parseInt(sc.next());
			xset.add(X[i]);
			yset.add(Y[i]);
		}
		xset.add(Integer.MIN_VALUE);
		xset.add(Integer.MAX_VALUE);
		yset.add(Integer.MIN_VALUE);
		yset.add(Integer.MAX_VALUE);
		HashMap<Integer, Integer> xs = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> ys = new HashMap<Integer, Integer>();
		int[] xpos = new int[xset.size()];
		for (int xv : xset) {
			xpos[xs.size()] = xv;
			xs.put(xv, xs.size());
		}
		int[] ypos = new int[yset.size()];
		for (int yv : yset) {
			ypos[ys.size()] = yv;
			ys.put(yv, ys.size());
		}
		int xl = xs.size();
		int yl = ys.size();
		int[][] dp = new int[xl][yl];
		for (int i = 0; i < N; ++i) {
			dp[xs.get(X[i])][ys.get(Y[i])]++;
		}
		for (int i = 1; i < xl; ++i) {
			for (int j = 1; j < yl; ++j) {
				dp[i][j] += dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
			}
		}
		for (int i = 0; i < M; ++i) {
			int x1 = pos(xpos, Integer.parseInt(sc.next()), true);
			int y1 = pos(ypos, Integer.parseInt(sc.next()), true);
			int x2 = pos(xpos, Integer.parseInt(sc.next()), false);
			int y2 = pos(ypos, Integer.parseInt(sc.next()), false);
			System.out.println(x1 > x2 || y1 > y2 ? 0 : dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]);
		}
	}

	static int pos(int[] coord, int p, boolean up) {
		int ret = Arrays.binarySearch(coord, p);
		if (ret < 0) ret = -ret - (up ? 1 : 2);
		if (ret >= coord.length) ret = coord.length - 1;
		return ret;
	}

}