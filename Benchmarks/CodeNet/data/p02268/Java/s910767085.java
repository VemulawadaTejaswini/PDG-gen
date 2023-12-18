import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		int count = 0;
		final int n = in.nextInt();
		int[] dataS = new int[n];
		
		for (int i = 0; i < n; i++) {
			dataS[i] = in.nextInt();
		}
		
		final int q = in.nextInt();
		
		for (int i = 0; i < q; i++) {
			final int search = in.nextInt();
			count += BinarySearch (dataS, search, n);
		}

		System.out.println(count);
	}
	
	public static int BinarySearch (int[] data, int s, int n) {
		int left = 0;
		int right = n;
		
		while (left < right) {
			int mid = (left + right) / 2;
			if (data[mid] == s) {
				return 1;
			} else if (s > data[mid]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return 0;
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
	
}

