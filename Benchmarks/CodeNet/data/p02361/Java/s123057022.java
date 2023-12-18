import java.util.*;
import java.io.*;

class Main {

	static final int INF = Integer.MAX_VALUE/2;
	public static final Comparator<Node> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<Node>{
		public int compare(Node x,Node y){
			return (x.d > y.d) ? 1 : ((x.d == y.d) ? 0 : -1);
		}
	}

	static class Node {
		int id;
		int d;
		Node(int id,int d){
			this.id = id;
			this.d = d;
		}
	}

	static class Edge {
		int to;
		int cost;
		Edge(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] str = line.split(" ");
		int v = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);

		LinkedList<LinkedList<Edge>> graph = new LinkedList<LinkedList<Edge>>();
		for (int i=0; i<v; i++) {
			graph.add(new LinkedList<Edge>());
		}

		for (int i=0; i<e; i++) {
			line = br.readLine();
			str = line.split(" ");
			int si = Integer.parseInt(str[0]);
			int ti = Integer.parseInt(str[1]);
			int di = Integer.parseInt(str[2]);
			LinkedList<Edge> list = graph.get(si);
			list.add(new Edge(ti,di));
		}

		PriorityQueue<Node> pQue = new PriorityQueue<Node>(10,COMPARATOR);
		int[] d = new int[v];
		Arrays.fill(d,INF);
		d[r] = 0;
		pQue.add(new Node(r,0));

		while (!pQue.isEmpty()) {
			Node node = pQue.poll();
			int now = node.id;
			if (d[now] < node.d)
				continue;
			LinkedList<Edge> list = graph.get(now);
			while (!list.isEmpty()) {
				Edge edge = list.poll();
				if (d[edge.to] > d[now] + edge.cost) {
					d[edge.to] = d[now] + edge.cost;
					pQue.add(new Node(edge.to,d[edge.to]));
				}
			}
		}

		for (int i : d) {
			System.out.println(i==INF?"INF":i);
		}

		br.close();
	}
}