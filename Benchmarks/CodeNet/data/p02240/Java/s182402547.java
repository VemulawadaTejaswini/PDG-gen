import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private final class Vertex {
		List<Integer> vertices = new ArrayList<>();
		int color = -1;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) vertices[i] = new Vertex();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			vertices[id1].vertices.add(id2);
			vertices[id2].vertices.add(id1);
		}
		
		assignColor(n, vertices);

		int q = Integer.parseInt(reader.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			int c1 = vertices[id1].color;
			int c2 = vertices[id2].color;
			if (c1 == c2 && c1 != -1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}

	private void assignColor(int n, Vertex[] vertices) {
		int color = 0;
		for (int i = 0; i < n; i++) {
			if (vertices[i].color == -1) {
				dfs(i, vertices, color);
			}
			color++;
		}
	}

	private void dfs(int id, Vertex[] vertices, int color) {
		Stack<Integer> st = new Stack<>();
		st.push(id);
		while (!st.empty()) {
			id = st.pop();
			vertices[id].color = color;
			int size = vertices[id].vertices.size();
			for (int i = 0; i < size; i++) {
				int nId = vertices[id].vertices.get(i);
				if (vertices[nId].color == -1) {
					st.push(nId);
				}
			}
		}
	}
}
