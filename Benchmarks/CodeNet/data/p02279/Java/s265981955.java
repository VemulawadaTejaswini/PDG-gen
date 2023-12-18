import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class RootedTrees {
		public void rootedtrees (InputReader ir) {
			
			int n = ir.nextInt();
			Node[] node = new Node[n];
			
			for (int i = 0; i < n; i++) {
				int id = ir.nextInt();
				int k = ir.nextInt();
				node[id] = new Node (k);
				
				if ( k != 0) {
					for (int j = 0; j < k; j++) {
						node[id].type[j] = ir.nextInt();
					}
				}
			}
			
			Parent(node);
			Depth(node);
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < n; i++) {
				
				int k = node[i].type.length;
				
				sb.append("node ").append(Integer.toString(i))
				.append(": parent = ").append(node[i].parent)
				.append(", depth = ").append(node[i].depth);
				
				if (node[i].parent == -1) {
					sb.append(", root, [");
				} else if (k == 0){
					sb.append(", leaf, [");
				} else {
					sb.append(", internal node, [");
				}
				
				if (k != 0) {
					for (int j = 0; j < k; j++) {
						sb.append(node[i].type[j]);
						if (j != k - 1) {
							sb.append(", ");
						}
					}
				}
				sb.append("]\n");
				
			}
			
			System.out.print(sb);
			
			
		}
		
		static void Parent (Node[] node) {
			
			int n = node.length;
			
			for (int i = 0; i < n; i++) {
				int lentype = node[i].type.length;
				for (int j = 0; j < lentype; j++) {
					node[node[i].type[j]].parent = i;
				}
			}
			
		}
		
		static void Depth (Node[] node) {
			int n = node.length;
			
			for (int i = 0; i < n; i++) {
				int lentype = node[i].type.length;
				for (int j = 0; j < lentype; j++) {
					node[node[i].type[j]].depth += node[i].depth + 1;
				}
			}
		}
		
		
		
	}
	
	static class Node {
		int parent;
		int depth;
		int[] type;
		public Node(int n) {
			parent = -1;
			depth = 0;
			type = new int[n];
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
		RootedTrees obj = new RootedTrees();
		obj.rootedtrees(in);
	}
	
}
