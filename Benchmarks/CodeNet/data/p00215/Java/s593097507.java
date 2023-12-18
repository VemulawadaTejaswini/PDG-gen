
import java.io.IOException;
import java.util.ArrayList;
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
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			list = new ArrayList<List<Pair>>();
			for (int i = 0; i < 6; i++) {
				list.add(new ArrayList<Pair>());
			}
			boolean[] b = new boolean[6];
			for (int i = 0; i < h; i++) {
				char[] cs = scanner.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (cs[j] == 'S') {
						sy = i;
						sx = j;
					} else if (cs[j] == 'G') {
						gy = i;
						gx = j;
					} else if (cs[j] != '.') {
						int c = Character.getNumericValue(cs[j]);
						list.get(c).add(new Pair(i, j));
						b[c] = true;
					}
				}
			}
			int sum = 0;
			for (int i = 1; i < 6; i++) {
				if (b[i])
					sum++;
			}
			min = Integer.MAX_VALUE;
			int index = -1;
			for (int i = 1; i < 6; i++) {
				int cos = slove(i, i == 1 ? 5 : i - 1);
				if (min > cos) {
					min = cos;
					index = i;
				}
			}
			System.out.println(index == -1 ? "NA" : index + " " + min);

		}

	}

	private int slove(int k, int g) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		int s = k == 5 ? 1 : k + 1;
		for (int i = 0; i < list.get(s).size(); i++) {
			int y = list.get(s).get(i).y;
			int x = list.get(s).get(i).x;
			int dis = Math.abs(y - sy) + Math.abs(x - sx);
			int gdis = Math.abs(y - gy) + Math.abs(x - gx);
			pq.add(new Pair(y, x, dis, k + 1, dis + gdis));
		}
		while (!pq.isEmpty()) {
			Pair pair = pq.poll();
			int y = pair.y;
			int x = pair.x;
			int cost = pair.cost;
			int id = pair.id;
			int tmpid = id > 5 ? id - 5 : id;
			if (id == 10) {
				return cost;
			}
			if (tmpid != g) {
				for (Pair i : list.get(tmpid == 5 ? 1 : tmpid + 1)) {
					int dis = Math.abs(y - i.y) + Math.abs(x - i.x);
					int gdis = Math.abs(i.y - gy) + Math.abs(i.x - gx);
					pq.add(new Pair(i.y, i.x, cost + dis, id + 1, cost + dis
							+ gdis));
				}
			} else {
				int dis = Math.abs(y - gy) + Math.abs(x - gx);
				pq.add(new Pair(0, 0, cost + dis, 10, cost));
			}
		}
		return Integer.MAX_VALUE;
	}

	List<List<Pair>> list;
	int sy;
	int gy;
	int sx;
	int gx;
	int min;

	class Pair implements Comparable<Pair> {
		int y;
		int x;
		int cost;
		int id;
		int md;

		@Override
		public int compareTo(Pair o) {
			if (this.md == o.md)
				return o.id - this.id;
			return this.md - o.md;
		}

		public Pair(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		public Pair(int y, int x, int cost, int id, int md) {
			super();
			this.y = y;
			this.x = x;
			this.cost = cost;
			this.md = md;
			this.id = id;
		}

	}
}