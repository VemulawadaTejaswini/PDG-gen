import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		long x = fs.nextLong();
		long k = fs.nextLong();
		long d = fs.nextLong();
		
		long diff = 0;
		long restK;
		if(k % 2 == 0) {
			diff = 0;
			restK = k;
		}else {
			if(x < 0) {
				x += k;
			}else {
				x -= k;
			}
			restK = k - 1;
		}
		
		long step = 2 * k;
		
		long sho = x / step;
		if(restK >= 2 * sho) {
			if(x > 0) {
				x -= sho * step;
			}else {
				x += sho * step;
			}
			
			restK -= 2 * sho;
		}else {
			if(x > 0) {
				x -= step * (restK / 2);
			}else {
				x += step * (restK / 2);
			}
			restK = 0;
		}
		
		if(restK > 0) {
			if(x > 0) {
				System.out.println(Math.min(Math.abs(x), Math.abs(x - step)));
			}else {
				System.out.println(Math.min(Math.abs(x), Math.abs(x + step)));
			}
		}else {
			System.out.println(Math.abs(x));
		}
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
