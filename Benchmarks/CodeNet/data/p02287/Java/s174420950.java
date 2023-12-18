import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] heap = new int[n];
		for(int i = 0; i < n; i++){
			heap[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			final int index = i + 1;
			System.out.print("node " + index + ": ");
			System.out.print("key = " + heap[i] + ", ");
			
			if(i != 0){
				System.out.print("parent key = " + heap[(i - 1) / 2]);
				System.out.print(", ");
			}
			
			if(i * 2 + 1 < n){
				System.out.print("left key = "  + heap[i * 2 + 1]);
				System.out.print(", ");
			}
			
			if(i * 2 + 2 < n){
				System.out.print("right key = " + heap[i * 2 + 2]);
				System.out.print(", ");
			}
			
			System.out.println();
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