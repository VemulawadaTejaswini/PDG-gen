import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int[] dx = {0, 1, 1, 0, -1, -1};
	static int[] dy = {1, 1, 0, -1, -1, 0};
	static int[][] time;
	static int offset = 50;

	static boolean solve() {
		int t = in.nextInt();
		int n = in.nextInt();
		if (t + n == 0) return false;

		time = new int[100][100];
		for (int i=0; i<100; i++) {
			Arrays.fill(time[i], -1);
		}

		for (int i=0; i<n; i++) {
			int x = in.nextInt() + offset;
			int y = in.nextInt() + offset;
			time[x][y] = 1<<30;
		}

		int sx = in.nextInt() + offset;
		int sy = in.nextInt() + offset;

		ArrayDeque<int[]> deq = new ArrayDeque<>();
		deq.add(new int[]{sx, sy, t});
		while (!deq.isEmpty()) {
			int[] cur = deq.pollFirst();
			int cx = cur[0], cy = cur[1];
			int ct = cur[2];
			time[cx][cy] = ct;

			if (ct == 0) continue;

			for (int i=0; i<6; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (time[nx][ny] < t) {
					deq.add(new int[]{nx, ny, ct-1});
				}
			}
		}

		int ans = 0;

		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (time[i][j] < 0 || time[i][j] == 1<<30) continue;
				ans++;
			}
		}

		out.println(ans);

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		while(solve());
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}