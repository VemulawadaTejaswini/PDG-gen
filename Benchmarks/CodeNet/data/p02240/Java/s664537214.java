import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	class Vertex {
		int c = -1;
		List<Integer> vertices = new ArrayList<Integer>();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			vertices[i] = new Vertex();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int u1 = Integer.parseInt(st.nextToken());
			int u2 = Integer.parseInt(st.nextToken());
			vertices[u1].vertices.add(u2);
			vertices[u2].vertices.add(u1);
		}
		dfs(vertices);
		int q = Integer.parseInt(reader.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int u1 = Integer.parseInt(st.nextToken());
			int u2 = Integer.parseInt(st.nextToken());
			if (vertices[u1].c == vertices[u2].c) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}
	
	private void dfs(Vertex[] vertices) {
		int color = 0;
		int n = vertices.length;
		for (int i = 0; i < n; i++) {
			if (vertices[i].c == -1) {
				color++;
				Stack<Integer> stack = new Stack<Integer>();
				stack.push(i);
				while (!stack.empty()) {
					Vertex vertex = vertices[stack.pop()];
					vertex.c = color;
					for (int j = 0; j < vertex.vertices.size(); j++) {
						int u = vertex.vertices.get(j);
						if (vertices[u].c == -1) {
							stack.push(u);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
