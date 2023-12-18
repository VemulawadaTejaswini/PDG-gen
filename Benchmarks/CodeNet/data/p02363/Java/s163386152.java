import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	int V, E;
	long[][] cost;
	static int INF = Integer.MAX_VALUE;

	public void solve() {
		V = nextInt();
		E = nextInt();

		cost = new long[V][V];
		for (int i = 0; i < V; i++) {
			Arrays.fill(cost[i], INF);
		}

		for (int i = 0; i < V; i++) {
			cost[i][i] = 0;
		}

		for (int i = 0; i < E; i++) {
			int s = nextInt();
			int t = nextInt();
			int d = nextInt();
			cost[s][t] = d;
		}

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				for (int k = 0; k < V; k++) {
					cost[j][k] = Math.min(cost[j][k], cost[j][i] + cost[i][k]);
				}
			}
		}

		boolean NEGATIVE = false;

		for (int i = 0; i < V; i++) {
			for (int j = i + 1; j < V; j++) {
				if (cost[i][j] < 0 && cost[j][i] < 0) {
					NEGATIVE = true;
				}
			}
		}

		if (NEGATIVE) {
			out.println("NEGATIVE CYCLE");
		} else {

			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (j != 0)
						out.print(" ");
					if (cost[i][j] == INF) {
						out.print("INF");
					} else {
						out.print(cost[i][j]);
					}
				}
				out.println();
			}
		}
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}