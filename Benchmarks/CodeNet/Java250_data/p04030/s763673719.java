import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final FastIn in = new FastIn();
	private static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		Solver sol = new Solver();
		sol.solve();
		out.close();
	}
	private static final class Solver {
		public void solve() {
			char[] line = in.next().toCharArray();
			ArrayDeque<Character> deque = new ArrayDeque<>();
			for (char c : line) {
				if (c == 'B') {
					if (!deque.isEmpty()) deque.pollLast();
				} else {
					deque.addLast(c);
				}
			}
			while (!deque.isEmpty()) out.print(deque.pollFirst());
			out.println();
		}
	}
	private static final class FastIn {
		private BufferedReader br;
		private StringTokenizer st;
		public FastIn() {
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
			st = null;
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
