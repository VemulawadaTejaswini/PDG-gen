import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;


public class Main {
	static int n;
	
	private static class Edge {
		int from;
		int to;
		int cost;
		
		Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			StringBuffer str = new StringBuffer();
			str.append(from);
			str.append(" ");
			str.append(to);
			str.append(" ");
			str.append(cost);
			return str.toString();
		}
	}
	
	private static class EdgeComparator implements Comparator<Edge>{
		@Override
		public int compare(Edge o1, Edge o2) {
			return o1.cost - o2.cost; // IDの値に従い昇順で並び替えたい場合
			// return -(user1.getId() - user2.getId()); // IDの値に従い降順で並び替えたい場合
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		n = sc.nextInt();

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		Edge[] mst = new Edge[n - 1];

		PriorityQueue<Edge> pq = new PriorityQueue<Edge>(11, new EdgeComparator());
		for (int i = 0, next = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (a[next][j] != -1) {
					pq.add(new Edge(next, j, a[next][j]));
				}
			}
			next = -1;
			Edge min = null;
			for (; next == -1; ) {
				min = pq.poll();
				assert min != null : "Empty?";
				next = min.to;
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (min.to == mst[j].to) {
							next = -1;
							break;
						}
					}
					if (min.to == mst[0].from) {
						next = -1;
					}
				}
			}
			mst[i] = min;
		}

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += mst[i].cost;
//			pr.print(i);
//			pr.print(" ");
//			pr.print(array[i].d);
//			pr.print(" ");
//			pr.print(prev[i]);
//			pr.print(" ");
//			pr.print(k[i]);
//			pr.println("");
		}
		pr.println(sum);

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	@SuppressWarnings("unused")
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}