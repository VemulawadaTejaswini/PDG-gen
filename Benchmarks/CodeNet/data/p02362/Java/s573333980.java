
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int V = scanner.nextInt();
		int E = scanner.nextInt();
		int r = scanner.nextInt();
		int[] d = new int[V];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[r] = 0;
		List<Edge> list = new ArrayList<Edge>();
		for (int i = 0; i < E; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			int l = scanner.nextInt();
			list.add(new Edge(s, t, l));
		}

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < E; j++) {
				Edge edge = list.get(j);
				if (d[edge.from] != Integer.MAX_VALUE
						&& d[edge.to] > d[edge.from] + edge.cost) {
					d[edge.to] = d[edge.from] + edge.cost;
					if (i == V - 1) {
						System.out.println("NEGATIVE CYCLE");
						return;
					}
				}
			}
		}
		for(int i = 0;i<V;i++){
			if(d[i]==Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(d[i]);
		}
	}

	class Edge {
		int from, to, cost;
		
		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", cost=" + cost + "]";
		}

		public Edge(int from, int to, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

	}
}