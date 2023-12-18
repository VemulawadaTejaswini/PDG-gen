import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class BinarySearch {
		static Node root = null;
		
		public void binarysearch (InputReader ir) {
			
			int m = ir.nextInt();
			
			for (int i = 0; i < m; i++) {
				String ord = ir.nextString();
				
				if (ord.equals("insert")) Insert (ir.nextInt());
				else if (ord.equals("print")) Print ();
				else if (ord.equals("find")) Find (ir.nextInt());
				
			}
			
		}
		
		static void Insert (int k) {
			
			Node x = root;
			Node y = null;
			Node z = new Node ();
			
			z.key = k;
			while (x != null) {
				y = x;
				if (z.key < x.key) {
					x = x.left;
				} else {
					x = x.right;
				}
			}
			
			z.parent = y;
			
			if (y == null) {
				root = z;
			} else if (z.key < y.key) {
				y.left = z;
			} else {
				y.right = z;
			}
			
			
		}
		
		static void Print () {
			
			StringBuilder sb = new StringBuilder();
			
			Inorder (sb, root);
			System.out.println(sb);
			sb.setLength(0);
			Preorder (sb, root);
			System.out.println(sb);
		}
		
		static void Find (int k) {
			
			Node x = root;
			
			while(x != null && k != x.key) {
				if(k < x.key) x = x.left;
				else x = x.right;
				}
			
			StringBuilder sb = new StringBuilder ();
			if (x != null) sb.append("yes");
			else sb.append("no");
			
			System.out.println(sb);
			
		}
		
		static void Preorder (StringBuilder sb, Node root) {
			if(root == null) return;
	        sb.append(" ").append(root.key);
	        Preorder(sb, root.left);
	        Preorder(sb, root.right);
		}
		
		static void Inorder (StringBuilder sb, Node root) {
			if(root == null) return;
	        Inorder(sb, root.left);
	        sb.append(" ").append(root.key);
	        Inorder(sb, root.right);
		}
	}
	
	static class Node {
		Integer key = null;
		Node parent;
		Node left;
		Node right;
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
		BinarySearch obj = new BinarySearch();
		obj.binarysearch(in);
	}
	
	
}

