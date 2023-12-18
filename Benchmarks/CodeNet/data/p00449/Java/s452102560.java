
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			if ((n | k) == 0)
				break;
			List<Edge>[] lists = new ArrayList[n];
			for (int i = 0; i < n; i++)
				lists[i] = new ArrayList<Edge>();
			while (k-- > 0) {
				int a = scanner.nextInt();
				if (a == 1) {
					int b = scanner.nextInt() - 1;
					int c = scanner.nextInt() - 1;
					int d = scanner.nextInt();
					lists[b].add(new Edge(c, d));
					lists[c].add(new Edge(b, d));
				} else {
					int s = scanner.nextInt() - 1;
					int g = scanner.nextInt() - 1;
					PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
					pq.offer(new Edge(s, 0));
					int ans = -1;
					while (!pq.isEmpty()) {
						Edge edge = pq.poll();
						if (edge.to == g) {
							ans = edge.cost;
							break;
						}
						for (Edge e : lists[edge.to]) {
							pq.offer(new Edge(e.to, e.cost + edge.cost));
						}
					}
					System.out.println(ans);
				}
			}
		}
	}

	class Edge implements Comparable<Edge> {
		@Override
		public String toString() {
			return "Edge [to=" + to + ", cost=" + cost + "]";
		}

		public Edge(int to, int cost) {
			super();
			this.to = to;
			this.cost = cost;
		}

		int to, cost;

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}
}