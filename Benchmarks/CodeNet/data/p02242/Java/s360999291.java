
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int u = in.nextInt();
		int[][] mat = new int[u][u];
		for (int i = 0; i < u; i++) {
			Arrays.fill(mat[i], -1);
		}
		for (int i = 0; i < u; i++) {
			int fromNode = in.nextInt();
			int toNodeCount = in.nextInt();
			for (int j = 0; j < toNodeCount; j++) {
				int toNode = in.nextInt();
				int edgeWeight = in.nextInt();
				mat[fromNode][toNode] = edgeWeight;
			}
		}

		// solve
		Set<Integer> x = new HashSet<>();
		Set<Integer> y = new HashSet<>();
		boolean[] visit = new boolean[u];
		for (int i = 1; i < u; i++) {
			y.add(i);
		}
		int[] nodeCost = new int[u];
		Arrays.fill(nodeCost, Integer.MAX_VALUE);
		x.add(0);
		nodeCost[0] = 0;
		visit[0] = true;

		while (!y.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int v = -1;
			for (int from : x) {
				for (int to = 0; to < u; to++) {
					int visitCost = mat[from][to] + nodeCost[from];
					// toのノードが最小コストで訪問済でない場合
					if (mat[from][to] != -1 && !visit[to] && visitCost <= nodeCost[to]) {
						nodeCost[to] = visitCost;
						if (nodeCost[to] < min) {
							min = nodeCost[to];
							v = to;
						}
					}
				}
			}
			x.add(v);
			y.remove(v);
			visit[v] = true;
		}

		for (int i = 0; i < u; i++) {
			System.out.println(i + " " + nodeCost[i]);
		}
	}

}

