import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int[] damage = new int[n];
		for (int i=0;i<n;i++) {
			damage[i] = sc.nextInt();
		}
		ArrayList<ArrayList<Integer>> magic = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<n;i++) {
			ArrayList<Integer> lst = new ArrayList<Integer>();
			magic.add(lst);
		}
		for (int i=0;i<m;i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			magic.get(a).add(b);
		}
		int[] dist = new int[n];
		for (int i=0;i<n;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		for (int i=0;i<=s;i++){
			que.add(new Node(0, i));
			dist[i] = 0;
		}
		int limit = s + 1;
		while (!que.isEmpty()) {
			Node node = que.poll();
			if (node.id == t) {
				System.out.println(node.cost);
				break;
			}
			ArrayList<Integer> lst = magic.get(node.id);
			for (int to: lst) {
				if (node.cost + damage[to] < dist[to]) {
					dist[to] = node.cost + damage[to];
					que.add(new Node(node.cost + damage[to], to));
				}
			}
			for (int i=limit;i<node.id;i++) {
				if (dist[i] > node.cost) {
					dist[i] = node.cost;
					que.add(new Node(node.cost, i));
				}
			}
			if (limit < node.id) limit = node.id;
		}
	}
}
class Node implements Comparable<Node> {
	int cost, id;
	Node (int cost, int id) {
		this.cost = cost;
		this.id = id;
	}
	public int compareTo(Node node) {
		return Integer.compare(cost, node.cost);
	}
}
