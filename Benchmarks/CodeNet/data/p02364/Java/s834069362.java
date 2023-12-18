import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int vertex;
	static int edge;
	static int[][] graph;
	static int cost[];
	static int parent[];
	static boolean visited[];
	static final int INFINITY = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		input();
		prim();
	}

	public static void prim() {
		int index = 1;
		for (int i = 1; i < vertex; i++) {
			for (int j = 1; j <= vertex; j++) {
				int weight = graph[index][j];
				if (cost[j] > weight && visited[j] == false && weight != 0) {
					cost[j] = weight;
					parent[j] = index;
				}
			}
			int min = INFINITY;
			for (int k = 1; k < cost.length; k++) {
				if (cost[k] < min && visited[k] == false) {
					min = cost[k];
					index = k;
				}
			}
			visited[index] = true;
		}
		int sum = 0;
		for (int m = 2; m < cost.length; m++) {
			sum += cost[m];
		}
		System.out.println(sum);
	}

	public static void input() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());

		vertex = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		graph = new int[vertex + 1][vertex + 1];
		cost = new int[vertex + 1];
		parent = new int[vertex + 1];
		visited = new boolean[vertex + 1];
		for (int k = 1; k <= vertex; k++) {
			cost[k] = INFINITY;
		}
		for (int i = 1; i <= edge; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a+1][b+1] = graph[b+1][a+1] = c;

		}
		cost[1] = 0;
		parent[1] = 1;
		visited[1] = true;

	}
}