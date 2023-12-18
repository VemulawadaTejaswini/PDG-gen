import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static class BinaryTree {
		int value;
		BinaryTree left, right;
		
		public BinaryTree(int value){
			this.value = value;
		}
		
		public void insert(int value){
			if(value < this.value){
				if(this.left == null){
					this.left = new BinaryTree(value);
				}else{
					this.left.insert(value);
				}
			}else{
				if(this.right == null){
					this.right = new BinaryTree(value);
				}else{
					this.right.insert(value);
				}
			}
		}
		
		public String toStringPre(){
			return " " + this.value + (this.left == null ? "" : this.left.toStringPre()) + "" + (this.right == null ? "" : this.right.toStringPre());
		}
		
		public String toStringIn(){
			return (this.left == null ? "" : this.left.toStringIn()) + " " + this.value + (this.right == null ? "" : this.right.toStringIn());
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int q = sc.nextInt();
		
		BinaryTree tree = null;
		for(int i = 0; i < q; i++){
			final String ops = sc.next();
			
			if("insert".equals(ops)){
				final int value = sc.nextInt();
				
				if(tree == null){
					tree = new BinaryTree(value);
				}else{
					tree.insert(value);
				}
			}else if("print".equals(ops)){
				System.out.println(tree.toStringIn());
				System.out.println(tree.toStringPre());
			}
		}
		
		
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