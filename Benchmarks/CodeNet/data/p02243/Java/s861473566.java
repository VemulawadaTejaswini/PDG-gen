
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n;
	public static void main(String[] args) throws IOException {

		// input
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		List<List<Edge>> list = new ArrayList<>();
		Node[] nodeList = new Node[n];
		for (int i = 0; i < n; i++) {
			nodeList[i] = new Node(i, Integer.MAX_VALUE);
		}
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < n; i++) {
			int u = in.nextInt();
			int k = in.nextInt();
			for (int j = 0; j < k; j++) {
				int c = in.nextInt();
				int v = in.nextInt();
				list.get(i).add(new Edge(c, v));
			}
		}

		// solve
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new MyComparator());
		boolean[] visited = new boolean[n];
		nodeList[0].cost = 0;
		pq.add(nodeList[0]);
		visited[0] = true;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int fromNode = node.nodeNum;
			visited[node.nodeNum] = true;
			List<Edge> edges = list.get(fromNode);
			for (Edge edge : edges) {
				// 遷移先ノードのコストのほうが大きい場合は更新
				if (nodeList[edge.toNodeNum].cost > nodeList[fromNode].cost + edge.weight
						&& !visited[edge.toNodeNum]) {
					nodeList[edge.toNodeNum].cost = nodeList[fromNode].cost + edge.weight;
					pq.add(nodeList[edge.toNodeNum]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + nodeList[i].cost);
		}





	}

	static class MyComparator implements Comparator {

		public int compare(Object o1, Object o2) {

			Node n1 = (Node) o1;
			Node n2 = (Node) o2;

			int weight1 = n1.cost;
			int weight2 = n2.cost;

			if (weight1 > weight2) {
				return 1;
			} else if (weight1 < weight2) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	static class Node {
		int nodeNum;
		int cost;

		public Node(int nodeNum, int weight) {
			this.nodeNum = nodeNum;
			this.cost = weight;
		}
	}
	static class Edge {
		int toNodeNum;
		int weight;

		public Edge(int nodeNum, int weight) {
			this.toNodeNum = nodeNum;
			this.weight = weight;
		}
	}

}

