import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	HashMap<Integer, Integer> gcdMap;

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		
		gcdMap = new HashMap<>();
		
		long sum = 0;
		
		for (int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				for(int k = j; k <= n; k++) {
					if(i == j && j == k) {
						sum += gcd3(i, j,k);
					}else if(i == j || j == k || k == i){
						sum += 3*gcd3(i, j,k);
					}else {
						sum += 6*gcd3(i, j,k);
					}
				}
			}
		}
		
		System.out.println(sum);
	}
	
	long gcd3(int a , int b, int c) {
		int firstGCD = gcd(a,b);
		int secondGCD = gcd(firstGCD, c);
		return (long)secondGCD;
	}
	
	int gcd(int a,int b) {
		
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int key = b*1000+a;
		if(gcdMap.containsKey(key)) {
			return gcdMap.get(key);
		}
		
		int r = a % b;
		while(r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		
		gcdMap.put(key, b);
		return b;
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
