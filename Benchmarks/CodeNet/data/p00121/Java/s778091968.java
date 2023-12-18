import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.HashMap;

class Util {
	public static int pow10[] = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
	public static int find0(int puz) {
		for (int i = 0; i < 8; ++i) {
			if (puz % 10 == 0)
				return 7 - i;
			puz /= 10;
		}
		return -1;
	}
	public static int piece(int puz, int i) {
		return (puz / pow10[7 - i]) % 10;
	}
	public static int swap(int puz, int i, int j) {
		int pi = piece(puz, i);
		int pj = piece(puz, j);
		return puz + pow10[7 - i] * (pj - pi) + pow10[7 - j] * (pi - pj);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ↓, →, ↑, ←
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
		while (sc.hasNext()) {
			Queue<Integer> que = new ArrayDeque<>();
			int init = 0;
			for (int i = 0; i < 8; ++i)
				init = init * 10 + sc.nextInt();
			que.add(init);
			memo.put(init, 0);
			while (que.size() != 0) {
				int now = que.poll();
				if (now == 1234567) break;
				int idx = Util.find0(now);
				for (int i = 0; i < 4; ++i) {
					int x = idx / 4; int y = idx % 4;
					int nx = x + dx[i]; int ny = y + dy[i];
					if ((0 <= nx && nx <= 1) && (0 <= ny && ny <= 3)) {
						int ni = nx * 4 + ny;
						int adj = Util.swap(now, ni, idx);
						if (memo.containsKey(adj)) continue;
						memo.put(adj, memo.get(now) + 1);
						que.add(adj);
					}
				}
			}
			System.out.println(memo.get(1234567));
			memo.clear();
		}
	}
}
