import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static Queue<Integer> stackX = new ArrayDeque<>();
	static Queue<Integer> stackY = new ArrayDeque<>();

	static int matrix[][];
	static int color[];
	static int dist[];
	static int n;

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String str[] = br.readLine().split(" ");
		n = Integer.parseInt(br.readLine());
		matrix = new int[n][n];
		color = new int[n];
		dist = new int[n];
		Arrays.fill(color, WHITE);
		Arrays.fill(dist, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			for (int j = 2; j < str.length; j += 2) {
				int v = Integer.parseInt(str[j]);
				int c = Integer.parseInt(str[j + 1]);
				matrix[u][v] = c;
			}
		}
		dijkstra();
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + dist[i]);
		}
	}

	static void dijkstra() {
		int vertex, min_d;
		PriorityQueue<Integer> pqX = new PriorityQueue<>();
		PriorityQueue<Integer> pqY = new PriorityQueue<>();

		dist[0] = 0;
		color[0] = GRAY;

		while (true) {
			vertex = -1;
			min_d = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (color[i] == GRAY && dist[i] < min_d) {
					min_d = dist[i];
					vertex = i;
				}
			}
			if (vertex == -1)
				break;
			color[vertex] = BLACK;

			for (int i = 0; i < n; i++) {
				if (color[i] != BLACK && matrix[vertex][i] < Integer.MAX_VALUE) {
					color[i] = GRAY;
					if (dist[i] > dist[vertex] + matrix[vertex][i]) {
						dist[i] = dist[vertex] + matrix[vertex][i];
					}
				}
			}
		}
	}
}
