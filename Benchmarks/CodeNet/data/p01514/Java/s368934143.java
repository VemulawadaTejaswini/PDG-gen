import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {
	int T, P, R;
	int[] correct, penalty;
	int[][] wrong;

	private class T implements Comparable<T> {
		int correct, penalty, tid;

		public T(int correct, int penalty, int tid) {
			this.correct = correct;
			this.penalty = penalty;
			this.tid = tid;
		}

		public int compareTo(T t) {
			if (this.correct == t.correct) {

				if (this.penalty == t.penalty) {
					return this.tid - t.tid;
				}

				return this.penalty - t.penalty;
			}
			return t.correct - this.correct;
		}
	}

	public void solve() {
		while (true) {
			T = nextInt();
			P = nextInt();
			R = nextInt();

			if (T + P + R == 0)
				break;

			wrong = new int[T + 1][P + 1];
			penalty = new int[T + 1];
			correct = new int[T + 1];
			for (int i = 0; i < R; i++) {

				int tid = nextInt();
				int pid = nextInt();
				int time = nextInt();
				String message = next();

				if (message.equals("CORRECT")) {
					penalty[tid] += wrong[tid][pid] * 1200 + time;
					correct[tid]++;
				} else {
					wrong[tid][pid]++;
				}
			}
			ArrayList<T> list = new ArrayList<T>();
			for (int i = 1; i <= T; i++) {
				list.add(new T(correct[i], penalty[i], i));
			}

			Collections.sort(list);

			for (T t : list) {
				out.println(t.tid + " " + t.correct + " " + t.penalty);
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