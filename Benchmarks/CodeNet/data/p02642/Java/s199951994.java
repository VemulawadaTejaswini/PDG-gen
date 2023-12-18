import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	int maxA = 1_000_000;
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		
		int[] valNum = new int[maxA+1];
		
		for(int i = 0; i < n; i++) {
			int a = fs.nextInt();
			valNum[a]++;
		}
		
		
		ArrayList<Integer> aList = new ArrayList<>();
		for(int i = 0; i <= maxA ; i++) {
			if(valNum[i] == 1) {
				aList.add(i);
			}
		}
		
		
		if(aList.size() == 0) {
			System.out.println(0);
			return;
		}
		
		if(aList.get(0) == 1) {
			System.out.println(1);
			return;
		}
		
		int ans = 0;
		int[] hurui = new int[maxA+1];
		for(Integer a : aList) {
			
			if(hurui[a] == 0) {
				ans++;
				for(int i = 1; i*a <= maxA; i++) {
					hurui[i*a] = 1;
				}
			}
		}
		
		System.out.println(ans);
		
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
