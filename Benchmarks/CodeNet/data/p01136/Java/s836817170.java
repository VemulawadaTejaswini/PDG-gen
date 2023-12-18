import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean[][] tables = new boolean[n][31];
		for(int i = 0; i < n; i++) {
			int m = s.nextInt();
			for(int j = 0; j < m; j++) {
				int day = s.nextInt();
				tables[i][day] = true;
			}
		}
		s.nextInt();
		System.out.println(solve(n, tables));
	}

	private static int solve(int n, boolean[][] tables) {
		boolean[][] graph = new boolean[n][n];
		for(int days = 1; days <= 30; days++) {
			for (int from = 0; from < n; from++) {
				for(int to = from; to < n; to++) {
					if (tables[from][days] && tables[to][days]) {
						graph[from][to] = graph[to][from] = true;
					}
				}
			}
			if (connect(n, graph)) {
				return days;
			}
		}
		return -1;
	}

	private static boolean connect(int n, boolean[][] graph) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		boolean[] reached = new boolean[n];
		reached[0] = true;
		while(!queue.isEmpty()) {
			int from = queue.poll();
			for(int i = 0; i < n; i++) {
				if (!reached[i] && graph[from][i]) {
					queue.offer(i);
					reached[i] = true;
				}
			}
		}
		
		for(boolean b : reached) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
}