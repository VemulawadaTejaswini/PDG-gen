import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void preorder(int node, int[] n_left, int[] n_right){
		System.out.print(" " + node);
		if(n_left[node] != -1){ preorder(n_left[node], n_left, n_right); }
		if(n_right[node] != -1){ preorder(n_right[node], n_left, n_right); }
	}
	
	public static void inorder(int node, int[] n_left, int[] n_right){
		if(n_left[node] != -1){ inorder(n_left[node], n_left, n_right); }
		System.out.print(" " + node);
		if(n_right[node] != -1){ inorder(n_right[node], n_left, n_right); }
	}

	public static void postorder(int node, int[] n_left, int[] n_right){
		if(n_left[node] != -1){ postorder(n_left[node], n_left, n_right); }
		if(n_right[node] != -1){ postorder(n_right[node], n_left, n_right); }
		System.out.print(" " + node);
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		int[] parent = new int[n];
		Arrays.fill(parent, -1);
		int[] n_left = new int[n];
		int[] n_right = new int[n];
		
		for(int i = 0; i < n; i++){
			final int id = sc.nextInt();
			final int left = sc.nextInt();
			final int right = sc.nextInt();
	
			n_left[id] = left;
			n_right[id] = right;
			if(left != -1){ parent[left] = id; }
			if(right != -1){ parent[right] = id; }
		}
		
		int root_node = -1;
		for(int i = 0; i < n; i++){
			if(parent[i] == -1){
				root_node = i;
				break;
			}
		}
		
		System.out.println("Preorder");
		preorder(root_node, n_left, n_right);
		System.out.println();
		
		System.out.println("Inorder");
		inorder(root_node, n_left, n_right);
		System.out.println();
		
		System.out.println("Postorder");
		postorder(root_node, n_left, n_right);
		System.out.println();
		
		
		
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}