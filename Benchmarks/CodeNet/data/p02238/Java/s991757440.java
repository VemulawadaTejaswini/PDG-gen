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
		int d[] = new int[n];
		int c[] = new int[n];
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
			d[i] = c[i] = -1;
		}
		reader.close();
		
		DFS(vertices, d, c, n);
		
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			System.out.println(vertex.id + " " + d[i] + " " + c[i]);
		}
	}

	private void DFS(Vertex[] vertices, int[] d, int[] c, int n) {
		int time = 0;
		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			Stack<Integer> stack = new Stack<Integer>();
			if (d[vertex.id - 1] == -1) {
				stack.push(vertex.id);
			}
			while (!stack.isEmpty()) {
				vertex = vertices[stack.peek()-1];
				if (d[vertex.id - 1] == -1) {
					d[vertex.id - 1] = ++time;
				}
				int id = next(vertices, d, vertex);
				if (id != -1) {
					d[id-1] = ++time;
					stack.push(id);
				} else {
					c[vertex.id - 1] = ++time;
					stack.pop();
				}
			}
		}
	}

	private int next(Vertex[] vertices, int[] d, Vertex vertex) {
		for (int i = 0; i < vertex.vertices.length; i++) {
			int id = vertex.vertices[i];
			if (d[id - 1] == -1) return id;
		}
		return -1;
	}
}

