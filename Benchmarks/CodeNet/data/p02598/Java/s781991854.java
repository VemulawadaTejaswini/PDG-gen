import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		
		int n = fs.nextInt();
		int k = fs.nextInt();
		
		HashMap<Double, Integer> honsuMap = new HashMap<>();
		TreeSet<Double> lengthSet = new TreeSet<>();
		
		for(int i = 0; i < n; i++) {
			
			double length = (double)fs.nextInt();
			lengthSet.add(length);
			incrementMap(honsuMap, length);
		}
		
		int cnt = 0;
		while(cnt <= k && lengthSet.last() > 1) {
			
			double lastLen = lengthSet.last();
			double newLen = lastLen / 2;
			
			decrementMap(honsuMap, lastLen);
			incrementMap(honsuMap, newLen);
			incrementMap(honsuMap, newLen);
			
			lengthSet.add(newLen);
			if(!honsuMap.containsKey(lastLen)) {
				lengthSet.remove(lastLen);
			}
		}
		
		double lastLen = lengthSet.last();
		System.out.println((int)Math.ceil(lastLen));
	}
	
	void decrementMap(HashMap<Double, Integer> map, double value) {
		
		int num = map.get(value);
		if(num == 1) {
			map.remove(value);
		}else {
			map.put(value, num-1);
		}
	}
	
	void incrementMap(HashMap<Double, Integer> map, double value) {
		
		
		if(!map.containsKey(value)) {
			map.put(value, 0);
		}
		
		int num = map.get(value);
		map.put(value, num+1);
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
