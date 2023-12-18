import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int x1 = Integer.parseInt(sa[0]) - 1;
		int y1 = Integer.parseInt(sa[1]) - 1;
		int x2 = Integer.parseInt(sa[2]) - 1;
		int y2 = Integer.parseInt(sa[3]) - 1;
		char[][] c = new char[h][w];
		for (int i = 0; i < h; i++) {
			c[i] = br.readLine().toCharArray();
		}
		br.close();

		int[][] dh = new int[h][w];
		int[][] dw = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(dh[i], Integer.MAX_VALUE);
			Arrays.fill(dw[i], Integer.MAX_VALUE);
		}
		long m = 10000000L;
		Queue<Long> que = new ArrayDeque<>();
		que.add(x1 * m + y1);
		dh[x1][y1] = 0;
		dw[x1][y1] = 0;
		while (!que.isEmpty()) {
			long cur = que.poll();
			int cx = (int) (cur / m);
			int cy = (int) (cur % m);
			int alt = Math.min(dh[cx][cy], dw[cx][cy]) + 1;

			int end = Math.max(cx - k, 0);
			for (int i = cx - 1; i >= end; i--) {
				if (c[i][cy] == '.' && alt < dh[i][cy]) {
					que.add(i * m + cy);
					dh[i][cy] = alt;
				} else {
					break;
				}
			}

			end = Math.min(cx + k, h - 1);
			for (int i = cx + 1; i <= end; i++) {
				if (c[i][cy] == '.' && alt < dh[i][cy]) {
					que.add(i * m + cy);
					dh[i][cy] = alt;
				} else {
					break;
				}
			}

			end = Math.max(cy - k, 0);
			for (int i = cy - 1; i >= end; i--) {
				if (c[cx][i] == '.' && alt < dw[cx][i]) {
					que.add(cx * m + i);
					dw[cx][i] = alt;
				} else {
					break;
				}
			}

			end = Math.min(cy + k, w - 1);
			for (int i = cy + 1; i <= end; i++) {
				if (c[cx][i] == '.' && alt < dw[cx][i]) {
					que.add(cx * m + i);
					dw[cx][i] = alt;
				} else {
					break;
				}
			}
		}
		int ans = Math.min(dh[x2][y2], dw[x2][y2]);
		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
