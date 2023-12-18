import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	class Edge {
		int to, cost;

		public Edge(int to, int cost) {
			// TODO 自動生成されたコンストラクター・スタブ
			this.to = to;
			this.cost = cost;
		}
	}
	
	class Node implements Comparable<Node> {
		int num;
		int dist;
		Node(int num, int dist) {
			this.num = num;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node o) {
			// TODO 自動生成されたメソッド・スタブ
			return this.dist - o.dist;
		}
	}
	
	int n, m;
	
	void dijkstra(int p, int q, ArrayList<LinkedList<Edge>> edges) {
		int INF = Integer.MAX_VALUE / 2;
		int[] d = new int[m + 1]; // 各駅への最短距離
		Arrays.fill(d, INF);
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		d[p] = 0;
		que.add(new Node(p, 0));
		
		while(!que.isEmpty()) {
			Node n = que.poll();
			int v = n.num;
			if (d[v] < n.dist) continue;
			for(Edge e : edges.get(v)) {
				if(d[e.to] > d[v] + e.cost) {
					d[e.to] = d[v] + e.cost;
					que.add(new Node(e.to, d[e.to]));
				}
			}
		}
		
		System.out.println(d[q]);
	}
	

	void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if (n == 0 || m == 0)
				break;
			ArrayList<LinkedList<Edge> > costedges = new ArrayList<LinkedList<Edge> >(m + 1);
			ArrayList<LinkedList<Edge> > timeedges = new ArrayList<LinkedList<Edge> >(m + 1);
			for(int i=0; i < m+1; i++) {
				costedges.add(new LinkedList<Edge>());
				timeedges.add(new LinkedList<Edge>());
			}
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int cost = scanner.nextInt();
				int time = scanner.nextInt();
				costedges.get(a).add(new Edge(b, cost));
				costedges.get(b).add(new Edge(a, cost));
				timeedges.get(a).add(new Edge(b, time));
				timeedges.get(b).add(new Edge(a, time));
			}
			int k = scanner.nextInt();
			if (k == 0)
				return;
			
			for (int i = 0; i < k; i++) {
				int p = scanner.nextInt();
				int q = scanner.nextInt();
				int r = scanner.nextInt();
				dijkstra(p, q, r == 0 ? costedges : timeedges);
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}

}