import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int id;
		List<Integer> vertices = new ArrayList<>();
		int visited = -1;
		int completed = -1;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
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
		
		dfs(vertices);
		
		for (int i = 0; i < n; i++) {
			Vertex v = vertices[i];
			System.out.println(v.id + " " + v.visited + " " + v.completed);
		}
	}

	private void dfs(Vertex[] vertices) {
		int time = 0;
		for (Vertex vertex : vertices) {
			if (vertex.visited != -1) continue;
			time = dfs(vertex, vertices, time);
		}
	}

	private int dfs(Vertex vertex, Vertex[] vertices, int time) {
		Stack<Integer> stack = new Stack<>();
		stack.push(vertex.id);
		while (!stack.empty()) {
			int id = stack.peek() - 1;
			if (vertices[id].visited == -1) {
				vertices[id].visited = ++time;
			}
			int nId = getNextUnvisitedId(vertices[id].vertices, vertices);
			if (nId == -1) {
				vertices[id].completed = ++time;
				stack.pop();
			} else {
				stack.push(nId);
			}
		}
		return time;
	}

	private int getNextUnvisitedId(List<Integer> ids, Vertex[] vertices) {
		for (Integer id : ids) {
			if (vertices[id - 1].visited != -1) continue;
			return id;
		}
		return -1;
	}
}
