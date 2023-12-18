import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int INF = 100000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numEdge = sc.nextInt();
		int start = sc.nextInt();
		int[][] graph = new int[num][num];
		for(int i = 0; i < num; i++){
			Arrays.fill(graph[i], Integer.MAX_VALUE);
		}
		createGraph(sc, numEdge, graph);
		
		long[] dist = null;
		try {
			dist = bellmanford(graph, start);
			for (int i = 0; i < num; i++)
				System.out.println(dist[i] >= INF ? "INF" : dist[i]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

	private static void createGraph(Scanner sc, int numEdge, int[][] graph) {
		for (int i = 0; i < numEdge; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			graph[u][v] = w;
		}
	}

	private static long[] bellmanford(int[][] graph, int start)	throws Exception {
		long[] dist = new long[graph.length];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		updateDist(graph, dist);
		return dist;
	}

	private static void updateDist(int[][] graph, long[] dist) throws Exception {
		int length = graph.length;
		for (int i = 1; i <= length; i++) {
			for (int u = 0; u < length; u++) {
				for (int v = 0; v < length; v++) {
					long newLength = dist[u] + graph[u][v];
					if (newLength < dist[v]) {
						// n回目の更新があった場合、閉路が存在する
						if (i == length)
							throw new Exception("NEGATIVE CYCLE");
						else
							dist[v] = newLength;
					}
				}
			}
		}
	}
}