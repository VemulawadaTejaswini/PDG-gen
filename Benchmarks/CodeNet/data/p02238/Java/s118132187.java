import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int id;
		int[] vertices;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vertices = new Vertex[n];
		int discovered[] = new int[n];
		int completed[] = new int[n];
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
			discovered[i] = completed[i] = -1;
		}
		reader.close();
		
		DFS(vertices, completed, discovered, n);
		
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			System.out.println(vertex.id + " " + completed[i] + " " + discovered[i]);
		}
	}

	private void DFS(Vertex[] vertices, int[] discovered, int[] completed, int n) {
		int time = 0;
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			Stack<Integer> stack = new Stack<Integer>();
			if (discovered[vertex.id - 1] == -1) {
				stack.push(vertex.id);
			}
			while (!stack.isEmpty()) {
				vertex = vertices[stack.peek()-1];
				if (discovered[vertex.id - 1] == -1) {
					discovered[vertex.id - 1] = ++time;
				}
				int id = next(vertices, discovered, vertex);
				if (id != -1) {
					discovered[id-1] = ++time;
					stack.push(id);
				} else {
					completed[vertex.id - 1] = ++time;
					stack.pop();
				}
			}
		}
	}

	private int next(Vertex[] vertices, int[] discovered, Vertex vertex) {
		for (int i = 0; i < vertex.vertices.length; i++) {
			int id = vertex.vertices[i];
			if (discovered[id - 1] == -1) return id;
		}
		return -1;
	}
}

