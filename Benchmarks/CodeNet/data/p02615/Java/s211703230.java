import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
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
		int[] aArr = fs.nextIntArr(n);
		
		Arrays.sort(aArr);
		
		long ans = 0;
		
		Comparator<Aida> aidaComparator = Comparator.comparing(Aida::getValue);
		ArrayDeque<Aida> aidaQue = new ArrayDeque<>();
		
		aidaQue.add(new Aida(aArr[n-1], aArr[n-1]));
		for(int i = n-2; i >= 0; i--) {
			
			Aida leftAida = aidaQue.poll();
			int aVal = aArr[i];
			ans += leftAida.getValue();
			aidaQue.add(new Aida(leftAida.one, aVal));
			aidaQue.add(new Aida(leftAida.two, aVal));
		}
		
		System.out.println(ans);
	}

	class Aida {
		
		int one;
		int two;
		
		Aida(int one, int two){
			this.one = one;
			this.two = two;
		}
		
		int getValue() {
			return Math.min(one, two);
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
