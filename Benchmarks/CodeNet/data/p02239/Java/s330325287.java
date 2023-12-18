import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int id;
		List<Integer> vertices = new ArrayList<>();
		int dist = Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			vertices[i] = new Vertex();
			StringTokenizer st = new StringTokenizer(reader.readLine());
			vertices[i].id = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				vertices[i].vertices.add(Integer.parseInt(st.nextToken()));
			}
		}
		reader.close();
		
		bfs(vertices);
		
		for (int i = 0; i < n; i++) {
			Vertex v = vertices[i];
			System.out.println(v.id + " " + (v.dist==Integer.MAX_VALUE?-1:v.dist));
		}
	}

	private void bfs(Vertex[] vertices) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {vertices[0].id, 0});
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			Vertex vertex = vertices[cur[0]-1];
			int dist = cur[1];
			vertex.dist = Math.min(vertex.dist, dist);
			for (Integer id : vertex.vertices) {
				if (vertices[id-1].dist == Integer.MAX_VALUE) {
					queue.add(new int[] {id, dist + 1});
				}
			}
		}
	}
}

