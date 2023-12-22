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
		
		long n = fs.nextLong();
		
		int digitNum = 1;
		long cumulate = pow(26L, digitNum);
		while(n > cumulate) {
			digitNum++;
			cumulate += pow(26L, digitNum);
		}
		
		
		n -= cumulate - pow(26L, digitNum);
		n--;
		
		String[] id = new String[digitNum];
		for(int i = 0; i < digitNum; i++) {
			id[i] = "a";
		}
		
		
		for(int i = digitNum; i >= 1; i--) {
			
//			long  sub = 0;
//			for(int j = 1; j <= digitNum-1;j++) {
//				sub += pow(26L, j);
//			}
			
			long pow = pow(26L, i-1);
			int num = 1;
			while(n >= num * pow) {
				num++;
			}
			num--;
			
			
			char[] arr = new char[1];
			arr[0] = (char)(97+num);
//			System.out.println(num);
			id[i-1] = new String(arr);
			n -= pow*num;
		}
		
		
		String ans = "";
		for(int i = digitNum-1; i >= 0; i--) {
			ans+=id[i];
		}
		
		System.out.println(ans);
	}

	public long pow(long base, int n) {
		long retVal = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
		}
		return retVal;
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
