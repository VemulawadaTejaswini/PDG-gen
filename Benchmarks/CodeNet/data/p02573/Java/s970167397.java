import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt(), m = reader.nextInt();
		HashMap<Integer, HashSet<Integer>> adj = new HashMap<Integer, HashSet<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.put(i, new HashSet<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int e1 = reader.nextInt() - 1, e2 = reader.nextInt() - 1;
			adj.get(e1).add(e2);
			adj.get(e2).add(e1);
		}
		int[] visited = new int[n];
		int maxSize = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == 0) {
				maxSize = Math.max(maxSize, dfs(i, visited, adj));
			}
		}
		System.out.println(maxSize);
		reader.close();
	}
	
	public static int dfs(int i, int[] visited, HashMap<Integer, HashSet<Integer>> adj) {
		int count = 1;
		visited[i] = 1;
		for (int neighbor: adj.get(i)) {
			if (visited[neighbor] == 0) {
				count += dfs(neighbor, visited, adj);
			}
		}
		return count;
	}
	
	
}
