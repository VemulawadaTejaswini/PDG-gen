import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] MOVE = { 1L << 32, 1, -(1L << 32), -1 };
	static int[] X, Y, head;
	static HashMap<Long, Integer> map;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			X = new int[2 * N];
			Y = new int[2 * N];
			head = new int[2 * N];
			map = new HashMap<Long, Integer>();
			for (int i = 0; i < N; ++i) {
				X[2 * i] = Integer.parseInt(sc.next()) + 1;
				Y[2 * i] = Integer.parseInt(sc.next()) + 1;
				if (sc.next().equals("x")) {
					X[2 * i + 1] = X[2 * i] + 1;
					Y[2 * i + 1] = Y[2 * i];
				} else {
					X[2 * i + 1] = X[2 * i];
					Y[2 * i + 1] = Y[2 * i] + 1;
				}
				map.put(((long) X[2 * i] << 32) + Y[2 * i], 2 * i);
				map.put(((long) X[2 * i + 1] << 32) + Y[2 * i + 1], 2 * i + 1);
			}
			boolean ok = true;
			for (int i = 0; i < 2 * N; i += 2) {
				if (head[i] != 0) continue;
				if (!check(i, true) && !check(i, false)) {
					ok = false;
					break;
				}
			}
			System.out.println(ok ? "Yes" : "No");
		}
	}

	static boolean check(int pos, boolean isHead) {
		ArrayDeque<Long> q = new ArrayDeque<Long>();
		q.add(pos + ((isHead ? 1L : 0L) << 32));
		while (!q.isEmpty()) {
			long cur = q.poll();
			int cp = (int) (cur & 0xFFFFFFF);
			boolean h = (cur >> 32) != 0;
			if (head[cp] != 0) {
				if ((head[cp] == 1) == h) {
					continue;
				} else {
					revert(pos);
					return false;
				}
			}
			head[cp] = h ? 1 : -1;
			long coord = ((long) X[cp] << 32) + Y[cp];
			for (int i = 0; i < 4; ++i) {
				long nc = coord + MOVE[i];
				if (!map.containsKey(nc)) continue;
				int np = map.get(nc);
				if (cp / 2 == np / 2) {
					q.add(np + ((h ? 0L : 1L) << 32));
				} else {
					q.add(np + ((h ? 1L : 0L) << 32));
				}
			}
		}
		return true;
	}

	static void revert(int pos) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(pos);
		while (!q.isEmpty()) {
			int cur = q.poll();
			head[cur] = 0;
			long coord = ((long) X[cur] << 32) + Y[cur];
			for (int i = 0; i < 4; ++i) {
				long nc = coord + MOVE[i];
				if (!map.containsKey(nc)) continue;
				int np = map.get(nc);
				if (head[np] != 0) q.add(np);
			}
		}
	}
}