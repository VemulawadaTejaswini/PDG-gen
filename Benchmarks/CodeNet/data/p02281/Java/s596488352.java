import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	static class TreeWalk {
		public void treewalk (InputReader ir) {
			
			int n = ir.nextInt();
			Node[] node = new Node[n];
			
			for (int i = 0; i < n; i++) {
				int id = ir.nextInt();
				node[id] = new Node();
				node[id].left = ir.nextInt();
				node[id].right = ir.nextInt();
			}
			
			Parent (node, n);
			int root = 0;
			for (int i = 0; i < n; i++) {
				if (node[i].parent == -1) {
					root = i;
					break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Preorder\n");
			Preorder (node, sb, root);
			System.out.println(sb);
			sb.setLength(0);
			sb.append("Inorder\n");
			Inorder (node, sb, root);
			System.out.println(sb);
			sb.setLength(0);
			sb.append("Postorder\n");
			Postorder (node, sb, root);
			System.out.println(sb);
			
			
			
		}
		
		static void Parent (Node[] node, int n) {
			
			for (int i = 0; i < n; i++) {
				if ( node[i].left != -1) {
					node[node[i].left].parent = i;
				} else if (node[i].right != -1) {
					node[node[i].right].parent = i;
				}
			}
			
		}
		
		static void Preorder (Node[] node, StringBuilder sb, int pos) {
			sb.append(" ").append(pos);
			if (node[pos].left != -1) Preorder (node, sb, node[pos].left);
			if (node[pos].right != -1) Preorder (node, sb, node[pos].right);
		}
		
		static void Inorder (Node[] node, StringBuilder sb, int pos) {
			if (node[pos].left != -1) Inorder (node, sb, node[pos].left);
			sb.append(" ").append(pos);
			if (node[pos].right != -1) Inorder (node, sb, node[pos].right);
		}
		
		static void Postorder (Node[] node, StringBuilder sb, int pos) {
			if (node[pos].left != -1) Postorder (node, sb, node[pos].left);
			if (node[pos].right != -1) Postorder (node, sb, node[pos].right);
			sb.append(" ").append(pos);
		}
		
	}
	
	static class Node {
		int parent;
		int left;
		int right;
		public Node() {
			parent = -1;
			left = -1;
			right = -1;
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
		TreeWalk obj = new TreeWalk();
		obj.treewalk(in);
	}
	
	
}
