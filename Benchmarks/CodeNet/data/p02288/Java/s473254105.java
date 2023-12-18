import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void maxHeapify(int[] A, int i, final int H){
		int l = i * 2 + 1;
		int r = i * 2 + 2;
		
		int largest = -1;
		
		if(l < H && A[l] > A[i]){
			largest = l;
		}else{
			largest = i;
		}
		
		if(r < H && A[r] > A[largest]){
			largest = r;
		}
		
		if(largest != i){
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			
			maxHeapify(A, largest, H);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] heap = new int[n];
		for(int i = 0; i < n; i++){
			heap[i] = sc.nextInt();
		}
		
		for(int i = n / 2; i >= 0; i--){
			maxHeapify(heap, i, n);
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(" " + heap[i]);
		}
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