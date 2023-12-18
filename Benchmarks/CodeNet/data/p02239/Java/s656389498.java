import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class BreadthFirstSearch {
		public void BFS (InputReader ir) {
			
			//
			int n = ir.nextInt();
			Graph[] graph = new Graph[n + 1];
			
			for (int i = 1; i <= n; i++) {
				int k = ir.nextInt();
				graph[k] = new Graph ();
				int m = ir.nextInt();
				for (int j = 0; j < m; j++) {
					graph[k].u.add(ir.nextInt());
				}
			}
				
			bfs (graph, 1, 0);
			
			StringBuilder sb = new StringBuilder ();
			for (int i = 1; i <= n; i++) {
				if (graph[i].d == null) graph[i].d = -1;
				sb.append(i).append(" ")
				.append(graph[i].d).append("\n");
			}
			
			System.out.print(sb);
			
		}
		
		static void bfs (Graph[] graph, Integer i, Integer count ) {
			
			if (graph[i].d == null || graph[i].d > count) {
				graph[i].d = count++;
				if (!graph[i].u.isEmpty()) {
					for (int j = 0; j < graph[i].u.size(); j++) {
						bfs (graph, graph[i].u.get(j), count);
					}
				}
			}
			
		}
		
	}
	static class Graph {
		List<Integer> u = new ArrayList<> ();
		Integer d;
		Graph () {
			d = null;
		}
	}
	
	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		BreadthFirstSearch obj = new BreadthFirstSearch ();
		obj.BFS (in);
	}
	
}

