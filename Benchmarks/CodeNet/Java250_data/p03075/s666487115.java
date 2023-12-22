
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			solveA();
			//			solveB();
			//			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();
		int numD = nextInt();
		int numE = nextInt();
		int numK = nextInt();

		int[] wk = new int[] { numA, numB, numC, numD, numE };
		Arrays.sort(wk);
		if (wk[4] - wk[0] > numK) {
			out.println(":(");
			return;
		}

		//		if (Math.abs(numA - numB) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numA - numC) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numA - numD) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numA - numE) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numB - numC) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numB - numD) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numB - numE) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numC - numD) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numC - numE) > numK) {
		//			out.println(":(");
		//			return;
		//		}
		//		if (Math.abs(numD - numE) > numK) {
		//			out.println(":(");
		//			return;
		//		}

		out.println("Yay!");
	}

	private static class SortComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			int sabun1 = (o1 % 10);
			int sabun2 = (o2 % 10);

			if (sabun1 == 0) {
				return -1;
			}
			if (sabun2 == 0) {
				return 1;
			}
			sabun1 = 10 - sabun1;
			sabun2 = 10 - sabun2;
			if (sabun1 < sabun2) {
				return -1;
			} else if (sabun1 < sabun2) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	private void solveB() {
		Integer[] wk = new Integer[5];
		for (int i = 0; i < wk.length; i++) {
			wk[i] = nextInt();
		}

		Arrays.sort(wk, new SortComparator());

		int res = 0;
		for (int i = 0; i < wk.length; i++) {

			if (res % 10 != 0) {
				int temp = 10 - res % 10;
				res += temp;
			}
			res += wk[i];
		}
		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();

		int[] wk = IntStream.range(0, numN).toArray();
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}