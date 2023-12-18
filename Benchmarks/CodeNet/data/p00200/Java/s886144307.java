import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;
	static int[] cost;
	static int[] time;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			if (n == 0 && m == 0) {
				break;
			}

			cost = new int[n];
			time = new int[n];

			Map<Integer, List<int[]>> time_edges = new HashMap<>();
			Map<Integer, List<int[]>> cost_edges = new HashMap<>();

			ArrayList<int[]> edge = null;

			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int cost = sc.nextInt();
				int time = sc.nextInt();

				int[] timeA = { a, b, time };
				int[] timeB = { b, a, time };
				int[] costA = { a, b, cost };
				int[] costB = { b, a, cost };

				List<int[]> time_edge_listA = null;
				List<int[]> time_edge_listB = null;
				if (time_edges.containsKey(a)) {
					time_edge_listA = time_edges.get(a);
				} else {
					time_edge_listA = new ArrayList<int[]>();
				}
				time_edge_listA.add(timeA);
				time_edges.put(a, time_edge_listA);

				if (time_edges.containsKey(b)) {
					time_edge_listB = time_edges.get(b);
				} else {
					time_edge_listB = new ArrayList<int[]>();
				}
				time_edge_listB.add(timeB);
				time_edges.put(b, time_edge_listB);

				// 値段のEdge入力
				List<int[]> cost_edge_listA = null;
				List<int[]> cost_edge_listB = null;
				if (cost_edges.containsKey(a)) {
					cost_edge_listA = cost_edges.get(a);
				} else {
					cost_edge_listA = new ArrayList<int[]>();
				}
				cost_edge_listA.add(costA);
				cost_edges.put(a, cost_edge_listA);

				if (cost_edges.containsKey(b)) {
					cost_edge_listB = cost_edges.get(b);
				} else {
					cost_edge_listB = new ArrayList<int[]>();
				}
				cost_edge_listB.add(costB);
				cost_edges.put(b, cost_edge_listB);

				edge = new ArrayList<int[]>();
			}

			int k = sc.nextInt();

			for (int i = 0; i < k; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				int r = sc.nextInt();
				if (r == 0) {
					System.out.println(dijkstra(cost_edges, p, q, m));
				} else {
					System.out.println(dijkstra(time_edges, p, q, m));
				}
			}

			// System.out.println(ans);
		}
	}
	// return min distance from start to end O(ElogV) (negative cost is prohibited)
	// edge is int[3] array {from,to,cost}
	// edges is edge list from specific node
	// all_edges is Map<from node number,edges>

	public static int dijkstra(Map<Integer, List<int[]>> all_edges, int start, int end, int max_node_number) {
		int[] distance = new int[max_node_number + 1];
		for (int i = 0; i < distance.length; i++)
			distance[i] = -1;
		PriorityQueue<int[]> p_que = new PriorityQueue<>((a, b) -> ((distance[a[0]] + a[2]) - (distance[b[0]] + b[2])));
		distance[start] = 0;
		List<int[]> edges = all_edges.get(start);
		for (int i = 0; i < edges.size(); i++)
			p_que.add(edges.get(i));
		while (distance[end] < 0) {
			int[] nearest_edge = p_que.poll();
			if (distance[nearest_edge[1]] < 0) {
				distance[nearest_edge[1]] = distance[nearest_edge[0]] + nearest_edge[2];
				if (all_edges.containsKey(nearest_edge[1])) {
					edges = all_edges.get(nearest_edge[1]);
					for (int i = 0; i < edges.size(); i++) {
						int[] edge = edges.get(i);
						if (distance[edge[1]] < 0)
							p_que.add(edge);
					}
				}
			}
		}
		return distance[end];
	}

	// 素数判定
	static boolean isPrime(long n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;

		int i = 3;
		while (i <= Math.sqrt(n)) {
			if (n % i == 0)
				return false;
			else
				i += 2;
		}
		return true;
	}

	// BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	// //二分探索
	// k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// 二分探索
	// k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

