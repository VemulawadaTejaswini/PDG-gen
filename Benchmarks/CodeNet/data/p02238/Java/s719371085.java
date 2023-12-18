import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int id;
		int[] vertices;
		int visited = -1;
		int completed = -1;
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
			int id = Integer.parseInt(st.nextToken());
			vertices[i].id = id;
			int cnt = Integer.parseInt(st.nextToken());
			vertices[i].vertices = new int[cnt];
			for (int j = 0; j < cnt; j++) {
				vertices[i].vertices[j] = Integer.parseInt(st.nextToken());
			}
		}
		reader.close();
		
		DFS(vertices, n);
		
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			System.out.println(vertex.id + " " + vertex.visited + " " + vertex.completed);
		}
	}

	private void DFS(Vertex[] vertices, int n) {
		int time = 0;
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			Stack<Integer> stack = new Stack<Integer>();
			if (vertex.visited == -1) {
				stack.push(vertex.id);
			}
			while (!stack.isEmpty()) {
				vertex = vertices[stack.peek()-1];
				if (vertex.visited == -1) {
					vertex.visited = ++time;
				}
				int childId = next(vertices, vertex.vertices);
				if (childId != -1) {
					vertices[childId-1].visited = ++time;
					stack.push(childId);
				} else {
					vertex.completed = ++time;
					stack.pop();
				}
			}
		}
	}

	private int next(Vertex[] vertices, int[] childIds) {
		for (int i = 0; i < childIds.length; i++) {
			if (vertices[childIds[i] - 1].visited == -1) return childIds[i];
		}
		return -1;
	}
}

