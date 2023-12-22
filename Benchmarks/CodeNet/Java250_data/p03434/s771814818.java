import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int N = fs.nextInt();
		int a[] = new int[N];
		int A = 0;
		int B = 0;

		for(int i=0; i<N; i++){
			a[i] = fs.nextInt();
		}
		Arrays.sort(a);

		for(int i=N-1; i>=0; i-=2){
			A += a[i];
		}
		for(int i=N-2; i>=0; i-=2){
			B += a[i];
		}

		System.out.println(A-B);




		

	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}
