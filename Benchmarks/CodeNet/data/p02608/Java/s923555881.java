import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		
		
		HashMap<Integer, List<String>> map = new HashMap<>();
		
		for(int x = 1; x <= 100; x++) {
			for(int y = 1; y <= 100; y++) {
				for(int z = 1; z <= 100; z++) {
					
					int val = x*x + y*y + z*z + x*y + y*z + z*x;
					int[] valArr = new int[3];
					valArr[0] = x;
					valArr[1] = y;
					valArr[2] = z;
					if(!map.containsKey(val)) {
						map.put(val, new ArrayList<>());
					}
					map.get(val).add(Arrays.toString(valArr));
				}
			}
		}
		
		for(int i = 1; i <= n; i++) {
			List<String> list = map.get(i);
			if(list == null) {
				System.out.println(0);
			}else {
				System.out.println(list.size());
			}
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
