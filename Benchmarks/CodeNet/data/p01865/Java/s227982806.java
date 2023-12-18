import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
			
		final int L = sc.nextInt();
		final int N = sc.nextInt();
		
		long sum = 0;
		for(int i = 0; i < N; i++){
			sum += (sc.nextLong() * sc.nextLong());
		}
		
		if(sum == 0){
			System.out.println(0);
		}else{
			System.out.println(1);
			System.out.println((sum < 0 ? 1 : -1) + " " + (Math.abs(sum)));
		}
		
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {
					tok = new StringTokenizer(br.readLine());
				}
			} catch (IOException e) { /* ignore */
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public void close() {
			try {
				br.close();
			} catch (IOException e) { /* ignore */
			}
		}
	}
}