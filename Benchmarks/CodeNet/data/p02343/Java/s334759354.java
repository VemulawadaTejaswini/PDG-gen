
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int q = in.nextInt();
			Uft[] uft = Uft.makeSet(n);

			for (int i = 0; i < q; i++) {
				int command = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();

				if (command == 0) {
					Uft.unite(uft, x, y);
				} else {
					if (Uft.isSame(uft, x, y)) {
						out.println(1);
					} else {
						out.println(0);
					}
				}
			}

		}
	}

	static class Uft {

		int p, rank;
		Uft(int p) {
			this.p = p;
			this.rank = 0;
		}
		static Uft[] makeSet(int n) {
			Uft[] uft = new Uft[n];
			for (int i = 0; i < n; i++) {
				uft[i] = new Uft(i);
			}
			return uft;
		}
		static void unite(Uft[] uft, int x, int y) {
			link(uft, findSet(uft, x), findSet(uft, y));
		}
		static boolean isSame(Uft[] uft, int x, int y) {
			return findSet(uft, x) == findSet(uft, y);
		}
		static void link(Uft[] uft, int x, int y) {
			if (uft[x].rank > uft[y].rank) {
				uft[y].p = x;
			} else {
				uft[x].p = y;
				if (uft[x].rank == uft[y].rank) {
					uft[y].rank++;
				}
			}
		}
		static int findSet(Uft[] uft, int x) {
			if (uft[x].p != x) {
				x = findSet(uft, uft[x].p);
			}
			return uft[x].p;
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

