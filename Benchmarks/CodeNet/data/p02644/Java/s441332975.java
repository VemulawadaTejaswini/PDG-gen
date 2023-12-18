import java.io.*;
import java.util.*;

public class Main implements Runnable {
	boolean oj = true;
	Reader scn;
	PrintWriter out;
	String INPUT = "";

	void solve() {
		int n = scn.nextInt(), m = scn.nextInt(), k = scn.nextInt();

		int x = scn.nextInt() - 1, y = scn.nextInt() - 1;
		int dx = scn.nextInt() - 1, dy = scn.nextInt() - 1;

		boolean[][] arr = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String s = scn.next();
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == '@') {
					arr[i][j] = true;
				}
			}
		}

		int[][][] dp = new int[n][m][4];
		scn.deepFillInt(dp, Integer.MAX_VALUE);
		Arrays.fill(dp[x][y], 0);
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((o1, o2) -> o1[2] - o2[2]);
		pq.add(new int[] { x, y, 0 });

		int d = 0;
		while (!pq.isEmpty()) {
			int[] rv = pq.poll();
			x = rv[0];
			y = rv[1];
			d = rv[2];

			if (x == dx && y == dy) {
				out.println(d);
				return;
			}

			// left -> 0
			for (int j = y - 1; j >= 0; j--) {
				if (arr[x][j]) {
					break;
				}
				int steps = (y - j + k - 1) / k;
				if (dp[x][j][0] > d + steps) {
					dp[x][j][0] = d + steps;
					pq.add(new int[] { x, j, d + steps });
				}
			}

			// right -> 1
			for (int j = y + 1; j < m; j++) {
				if (arr[x][j]) {
					break;
				}
				int steps = (j - y + k - 1) / k;
				if (dp[x][j][1] > d + steps) {
					dp[x][j][1] = d + steps;
					pq.add(new int[] { x, j, d + steps });
				}
			}

			// up -> 2
			for (int i = x - 1; i >= 0; i--) {
				if (arr[i][y]) {
					break;
				}
				int steps = (x - i + k - 1) / k;
				if (dp[i][y][2] > d + steps) {
					dp[i][y][2] = d + steps;
					pq.add(new int[] { i, y, d + steps });
				}
			}
			
			// down -> 3
			for (int i = x + 1; i < n; i++) {
				if (arr[i][y]) {
					break;
				}
				int steps = (i - x + k - 1) / k;
				if (dp[i][y][3] > d + steps) {
					dp[i][y][3] = d + steps;
					pq.add(new int[] { i, y, d + steps });
				}
			}
		}
		out.println(-1);
	}

	public void run() {
		long time = System.currentTimeMillis();
		boolean judge = System.getProperty("ONLINE_JUDGE") != null || oj;
		out = new PrintWriter(System.out);
		scn = new Reader(judge);
		solve();
		out.flush();
		if (!judge) {
			System.out.println(Arrays.deepToString(new Object[] { System.currentTimeMillis() - time + " ms" }));
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "Main", 1 << 28).start();
	}

	class Reader {
		InputStream is;

		public Reader(boolean oj) {
			is = oj ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		}

		byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;

		int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}

		boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		String next() {
			int b = skip();
			StringBuilder stringB = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				stringB.appendCodePoint(b);
				b = readByte();
			}
			return stringB.toString();
		}

		String nextLine() {
			int b = skip();
			StringBuilder stringB = new StringBuilder();
			while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
				stringB.appendCodePoint(b);
				b = readByte();
			}
			return stringB.toString();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		char nextChar() {
			return (char) skip();
		}

		char[] next(int n) {
			char[] buff = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buff[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buff : Arrays.copyOf(buff, p);
		}

		int nextInt() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

		long nextLong() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

		long[] nextLongArr(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		int[] nextIntArr(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		char[][] nextMat(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		long[][] next2Long(int n, int m) {
			long[][] arr = new long[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLongArr(m);
			}
			return arr;
		}

		int[][] next2Int(int n, int m) {
			int[][] arr = new int[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextIntArr(m);
			}
			return arr;
		}

		long[] shuffle(long[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			}
			return arr;
		}

		int[] shuffle(int[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			}
			return arr;
		}

		long[] uniq(long[] arr) {
			arr = scn.shuffle(arr);
			Arrays.parallelSort(arr);
			long[] rv = new long[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		int[] uniq(int[] arr) {
			arr = scn.shuffle(arr);
			Arrays.parallelSort(arr);
			int[] rv = new int[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		long[] reverse(long[] arr) {
			int i = 0, j = arr.length - 1;
			while (i < j) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				i++;
				j--;
			}
			return arr;
		}

		int[] reverse(int[] arr) {
			int i = 0, j = arr.length - 1;
			while (i < j) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				i++;
				j--;
			}
			return arr;
		}

		long[] compres(long[] arr) {
			int n = arr.length;
			long[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		int[] compres(int[] arr) {
			int n = arr.length;
			int[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		void deepFillLong(Object array, long val) {
			if (!array.getClass().isArray()) {
				throw new IllegalArgumentException();
			}
			if (array instanceof long[]) {
				long[] intArray = (long[]) array;
				Arrays.fill(intArray, val);
			} else {
				Object[] objArray = (Object[]) array;
				for (Object obj : objArray) {
					deepFillLong(obj, val);
				}
			}
		}

		void deepFillInt(Object array, int val) {
			if (!array.getClass().isArray()) {
				throw new IllegalArgumentException();
			}
			if (array instanceof int[]) {
				int[] intArray = (int[]) array;
				Arrays.fill(intArray, val);
			} else {
				Object[] objArray = (Object[]) array;
				for (Object obj : objArray) {
					deepFillInt(obj, val);
				}
			}
		}

		void tr(Object... o) {
			if (!oj)
				System.out.println(Arrays.deepToString(o));
		}
	}
}