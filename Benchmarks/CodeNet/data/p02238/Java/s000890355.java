import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
6
1 2 2 3
2 2 3 4
3 1 5
4 1 6
5 1 6
6 0 
 * */

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
	
	public void run() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			vertices[i] = new Vertex();
			vertices[i].id = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			vertices[i].vertices = new int[cnt];
			for (int j = 0; j < cnt; j++) {
				vertices[i].vertices[j] = Integer.parseInt(st.nextToken());
			}
		}
		reader.close();
		
		dfs(vertices, n);

		for (int i = 0; i < n; i++) {
			Vertex vertex = vertices[i];
			System.out.println(vertex.id + " " + vertex.visited + " " + vertex.completed);
		}
	}

	private void dfs(Vertex[] vertices, int n) {
		int time = 0;
		for (int i = 0; i < n; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			if (vertices[i].visited == -1) {
				stack.push(vertices[i].id);
			}
			while (!stack.isEmpty()) {
				Vertex cur = vertices[stack.peek()-1];
				if (cur.visited == -1) {
					cur.visited = ++time;
				}
				boolean allVisited = true;
				for (int j = 0; j < cur.vertices.length; j++) {
					int id = cur.vertices[j];
					if (vertices[id-1].visited == -1) {
						allVisited = false;
						vertices[id-1].visited = ++time;
						stack.push(id);
					}
				}
				if (allVisited) {
					cur.completed = ++time;
					stack.pop();
				}
			}
		}
	}
}

