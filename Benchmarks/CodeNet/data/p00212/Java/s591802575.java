
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int c = scanner.nextInt();
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int s = scanner.nextInt();
			int d = scanner.nextInt();
			if ((c | n | m | s | d) == 0)
				break;
			s--;
			d--;
			List<List<Pair>> list = new ArrayList<List<Pair>>();
			for (int i = 0; i < n; i++) {
				list.add(new ArrayList<Pair>());
			}
			for (int i = 0; i < m; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				int cost = scanner.nextInt();
				list.get(a).add(new Pair(b, cost));
				list.get(b).add(new Pair(a, cost));
			}
			PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
			pq.add(new Pair(s, 0, c));
			int[][] costs = new int[c + 1][n];
			for (int[] a : costs)
				Arrays.fill(a, 1 << 24);
			for (int i = 0; i <= c; i++)
				costs[i][s] = 0;
			boolean[][] b = new boolean[c + 1][n];
			while (!pq.isEmpty()) {
				Pair pair = pq.poll();
				int first = pair.first;
				b[pair.c][first] = true;
				if (costs[pair.c][first] < pair.second)
					continue;
				if (pair.first == d) {
					System.out.println(pair.second);
					break;
				}
				for (Pair p : list.get(first)) {
					if (b[pair.c][p.first] )
						continue;
					if (costs[pair.c][p.first] > p.second + pair.second) {
						costs[pair.c][p.first] = p.second + pair.second;
						pq.add(new Pair(p.first, p.second + pair.second, pair.c));
					}
					if (pair.c > 0) {
						if(b[pair.c-1][p.first])
							continue;
						if (costs[pair.c - 1][p.first] > p.second / 2
								+ pair.second) {
							costs[pair.c - 1][p.first] = p.second / 2
									+ pair.second;
							pq.add(new Pair(p.first,
									p.second / 2 + pair.second, pair.c - 1));
						}
					}
				}
			}

		}
	}

	class Pair implements Comparable<Pair> {
		int first;
		int second;
		int c;

		public Pair(int first, int second) {
			super();
			this.first = first;
			this.second = second;
		}

		public Pair(int first, int second, int c) {
			super();
			this.first = first;
			this.second = second;
			this.c = c;
		}

		@Override
		public int compareTo(Pair o) {
			return this.second - o.second;
		}

	}
}