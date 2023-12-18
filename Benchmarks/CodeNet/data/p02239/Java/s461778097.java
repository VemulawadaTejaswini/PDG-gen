import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	final int INF = Integer.MAX_VALUE;

	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		boolean[][] g = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			for (int j = 0; j < k; j++) {
				int v = scan.nextInt();
				g[u - 1][v - 1] = true;
			}
		}

		int[] d = new int[n];
		boolean[] isSearched = new boolean[n];
		Queue<Integer> que = new LinkedList<Integer>();

		for (int i = 0; i < n; i++)
			d[i] = INF;
		que.add(0);
		d[0] = 0;
		for (int i = 1; !que.isEmpty(); i++) {
			int id = que.poll();
			if (isSearched[id])
				continue;
			for (int j = 0; j < n; j++) {
				if (g[id][j]) {
					d[j] = Math.min(d[j], i);
					que.add(j);
				}
			}
			isSearched[id] = true;
		}
		for (int i = 0; i < n; i++)
			System.out.println((i + 1) + " " + (isSearched[i] ? d[i] : -1));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

