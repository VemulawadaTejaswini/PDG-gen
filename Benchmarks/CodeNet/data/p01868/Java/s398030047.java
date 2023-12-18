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
		
		final int N = sc.nextInt();
		
		int[] task = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++){
			task[i] = sc.nextInt();
			sum += task[i];
		}
		Arrays.sort(task);
		
		int lower = 0, upper = sum; // (lower, upper]
		BIN:
		while(upper - lower > 1){
			final int mid = (lower + upper) / 2;
			
			int[] rest = {mid, mid, mid};
			LOOP:
			for(int t = N - 1; t >= 0; t--){
				//System.out.println(mid + " " + t + " " + task[t] + " " + Arrays.toString(rest));
				
				int max = -1;
				int max_pos = -1;
				
				for(int i = 0; i < rest.length; i++){
					if(rest[i] >= task[t] && max < rest[i]){
						max = rest[i];
						max_pos = i;
					}
				}
				
				if(max_pos >= 0){
					rest[max_pos] -= task[t];
					continue LOOP;
				}
				
				lower = mid;
				continue BIN;
			}
			
			upper = mid;
			continue BIN;
		}
		
		System.out.println(upper);
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