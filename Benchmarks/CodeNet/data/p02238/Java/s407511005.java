import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class DepthFirstSearch {
		public void dfs (InputReader ir) {
			
			// 頂点の数
			int n = ir.nextInt();
			Graph[] graph  = new Graph[n + 1];
			
			// 入力
			for (int i = 1; i <= n; i++) {
				graph[i] = new Graph (ir.nextInt());
				for (int j = 0; j < ir.nextInt(); j++) {
					graph[i].u.add(ir.nextInt());
				}
			}
			
			int k = 1;
			int count = 1;
			graph[1].d = count;
			
		Outer:		
			while (true) {
				
				while (!graph[k].u.isEmpty()) {
					int x = graph[k].u.poll();
					if (graph[x].d == null) {
						graph[x].d = ++count;
						graph[x].pre = k;
						k = x;
						continue Outer;
					}
				}
				
				graph[k].f = ++count; 
				if (k == 1) break;
				k = graph[k].pre;
				
			}
			
			StringBuilder sb = new StringBuilder ();
			for (int i = 1; i <= n; i++) {
				sb.append(i).append(" ")
				.append(graph[i].d).append(" ")
				.append(graph[i].f).append("\n");
			}
			
			System.out.print(sb);
		
		}
	}
	
	static class Graph {
		int id;
		Queue<Integer> u = new PriorityQueue<> ();
		Integer d;
		Integer f;
		Integer pre;
		Graph (int i) {
			id = i;
			d = null;
			f = null;
			pre = null;
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
		DepthFirstSearch obj = new DepthFirstSearch ();
		obj.dfs (in);
	}
	
}

