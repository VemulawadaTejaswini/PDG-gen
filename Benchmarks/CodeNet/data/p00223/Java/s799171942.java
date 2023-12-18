
import java.io.IOException;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import lombok.Data;
import scala.inline;
import scala.collection.parallel.immutable.ParIterable;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			Pair kazuyuki = new Pair(b, a);
			Pair takayuki = new Pair(d, c);
			boolean[][] map = new boolean[h + 2][w + 2];
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					map[i][j] = scanner.nextInt() == 0;
				}
			}
			PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
			int dis = dist(takayuki, kazuyuki);
			pq.add(new Pair(takayuki.y, takayuki.x, kazuyuki.y, kazuyuki.x, 0,
					dis));
			String ans = "NA";
			boolean[][] tb = new boolean[h + 2][w + 2];
			boolean[][] kb = new boolean[h + 2][w + 2];
			int[][][][] costs = new int[h + 2][w + 2][h + 2][w + 2];
			for (int[][][] aaa : costs)
				for (int[][] aa : aaa)
					for (int[] cos : aa)
						Arrays.fill(cos, 1 << 24);
			while (!pq.isEmpty()) {
				Pair pair = pq.poll();
				if (pair.cost == 100)
					continue;
				if (pair.y == pair.dy && pair.x == pair.dx) {
					flag = true;
					ans = String.valueOf(pair.cost);
					break;
				}
				tb[pair.y][pair.x] = true;
				kb[pair.dy][pair.dx] = true;
				if (costs[pair.y][pair.x][pair.dy][pair.dx] < pair.md) {
					continue;
				} else {
					costs[pair.y][pair.x][pair.dy][pair.dx] = pair.md;
				}

				for (int i = 0; i < 4; i++) {
					int nty = pair.y + move[i][0];
					int ntx = pair.x + move[i][1];
					int nky = pair.dy + move[i][2];
					int nkx = pair.dx + move[i][3];
					if (!map[nty][ntx]) {
						nty = pair.y;
						ntx = pair.x;
					}
					if (!map[nky][nkx]) {
						nky = pair.dy;
						nkx = pair.dx;
					}
					if (tb[nty][ntx] && kb[nky][nkx])
						continue;
					int newdis = dist(new Pair(nty, ntx), new Pair(nky, nkx));
					pq.add(new Pair(nty, ntx, nky, nkx, pair.cost + 1,
							pair.cost + 1 + newdis));
				}
			}
			System.out.println(ans);
		}
	}

	int[][] move = { { -1, 0, 1, 0 }, { 0, -1, 0, 1 }, { 1, 0, -1, 0 },
			{ 0, 1, 0, -1 } };

	int dist(Pair a, Pair b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}

	class Pair implements Comparable<Pair> {
		int y;
		int x;
		int dy;
		int dx;
		int cost;
		int md;

		public Pair(int y, int x, int dy, int dx, int cost, int md) {
			super();
			this.y = y;
			this.x = x;
			this.dy = dy;
			this.dx = dx;
			this.cost = cost;
			this.md = md;
		}

		public Pair(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.md == o.md)
				return this.cost - o.cost;
			return this.md - o.md;
		}

	}
}