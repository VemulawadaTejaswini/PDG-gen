import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Introduction to Heuristics Contest
 * this code is based on submission by tsukammo
 */
public class Main {

	// only call
	public static void main(String[] args) throws IOException {
		if (submit) {
			out = new PrintWriter(System.out);
		} else {
			out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		}
		new Main().run();
		out.flush();
	}

	// variables
	int D, T;
	int[] c;
	int[][] s;
	int[] preOpen;
	Node ans;
	Set<Integer> loopCheck = new HashSet<>();

	// param
	final long T0 = 2000;
	final long T1 = 600;
	final long TIME_LIMIT = 1900;

	// predefined
	FastScanner in = new FastScanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static final String FILE_PATH = ".\\";
	static File file = new File(FILE_PATH + "result.out");
	long st = 0, et = 0;
	public Random rnd = new Random(123);

	void run() {
		input();
		init();
		solve();
		output();
	}

	void solve() {
		Node now = new Node(D);
		now.eval();
		ans = now;
		System.err.println("first=" + now.score);
		now.evalTmp(null);
		int tmpScore = now.score;
		int checkSum = 0;
		for (int i = 0; i < T; i++) {
			checkSum += now.scoreC[i];
		}
		System.err.println("tmpScore=" + now.score + " " + checkSum);
		long currentTime = System.currentTimeMillis();
		int loopCount = 0;
		double temperature = T0;
		while (currentTime < et) {
			loopCount++;
			int r = 0;//rnd.nextInt(2);
			int cd = -1;
			int cd2 = -1;
			int ct = -1;
			switch (r) {
				case 0:
					cd = rnd.nextInt(D);
					ct = rnd.nextInt(T);
					while (now.contests[cd] == ct) {
						cd = rnd.nextInt(D);
						ct = rnd.nextInt(T);
					}
					tmpScore = now.evalChange(cd, ct);
					break;
				case 1:
					cd = rnd.nextInt(D);
					cd2 = rnd.nextInt(D);
					ct = now.contests[cd];
					while (cd == cd2 || Math.abs(cd - cd2) > 12 || ct == now.contests[cd2]) {
						cd2 = rnd.nextInt(D);
					}
					tmpScore = now.evalSwap(cd, cd2);
					break;
				case 2:
					cd = rnd.nextInt(D - 1);
					tmpScore = now.evalSwap(cd);
					break;
			}
			if (loopCount % 100 == 0) {
				currentTime = System.currentTimeMillis();
				long t = currentTime - st;
				temperature = Math.pow(T0, 1-(t*1.0/TIME_LIMIT)) * Math.pow(T1, t*1.0/TIME_LIMIT);
			}
			double accept = rnd.nextDouble();

			if (now.score <= tmpScore || accept < Math.pow(Math.E, (tmpScore-now.score)/temperature)) {
				//System.err.println(String.format("%d, %d, %f",currentTime-st,tmpScore,temperature));
				switch (r) {
				case 0:
					now.stateChange(cd, ct);
					break;
				case 1:
					now.stateSwap(cd, cd2);
					break;
				case 2:
					now.stateSwap(cd);
					break;
				}
				now.eval();
				if(now.score != tmpScore) {
					System.err.println(r + " " + loopCount);
				}
			} else {
				// rollback
			}
		}
		checkSum = 0;
		for (int i = 0; i < T; i++) {
			checkSum += now.scoreC[i];
		}
		now.eval();
		System.err.println("final=" + now.score + " " + checkSum);
		System.err.println("loop=" + loopCount);
		System.err.println("solve END.");
	}

	void output() {
		for (int i = 0; i < D; i++) {
			out.println(ans.contests[i] + 1);
		}
	}

	void init() {
		preOpen = new int[T];
	}

	void input() {
		D = in.nextInt();
		st = System.currentTimeMillis();
		et = st + TIME_LIMIT;
		T = 26;
		c = new int[T];
		for (int i = 0; i < T; i++) {
			c[i] = in.nextInt();
		}
		s = new int[D][T];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < T; j++) {
				s[i][j] = in.nextInt();
			}
		}
		System.err.println("input END.");
	}







	int[] preDay = new int[] { -1, -1 };

	class Node implements Comparable<Node> {

		int score;
		int[] scoreC;
		int[] contests;

		public Node(int D) {
			this.score = 0;
			scoreC = new int[T];
			contests = new int[D];
			Arrays.fill(preOpen, -1);
			for (int i = 0; i < contests.length; i++) {
                // 貪欲
                int max_score = Integer.MIN_VALUE;
				int best_i = 0;
				ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < T; j++) {
                    contests[i] = j;
					int score = this.eval();
					temp.add(score);
                    if(max_score<score){
                        max_score = score;
                        best_i = j;
                    }
				}
                contests[i] = best_i;
            }
            this.score = this.eval();
		}

		int evalSwap(int d1, int d2) {
			int ret = this.score;
			int before = this.contests[d1];
			int after = this.contests[d2];
			ret -= this.scoreC[before];
			ret -= this.scoreC[after];
			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				if (i == d1) {
					ret += s[i][after];
					preDay[1] = i;
				} else if (i == d2) {
					ret += s[i][before];
					preDay[0] = i;
				} else {
					int t = this.contests[i];
					if (t == before) {
						ret += s[i][t];
						preDay[0] = i;
					} else if (t == after) {
						ret += s[i][t];
						preDay[1] = i;
					}
				}
				ret -= c[before] * (i - preDay[0]);
				ret -= c[after] * (i - preDay[1]);
			}
			return ret;
		}

		void stateSwap(int d1, int d2) {
			int before = this.contests[d1];
			int after = this.contests[d2];
			this.contests[d1] = after;
			this.contests[d2] = before;
			// eval();
			this.scoreC[before] = 0;
			this.scoreC[after] = 0;

			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (t == before) {
					this.scoreC[before] += s[i][t];
					preDay[0] = i;
				} else if (t == after) {
					this.scoreC[after] += s[i][t];
					preDay[1] = i;
				}
				this.scoreC[before] -= c[before] * (i - preDay[0]);
				this.scoreC[after] -= c[after] * (i - preDay[1]);
			}
		}

		int evalSwap(int d) {
			int ret = this.score;
			int before = this.contests[d];
			int after = this.contests[d + 1];
			ret -= this.scoreC[before];
			ret -= this.scoreC[after];
			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (i == d) {
					ret += s[i][after];
					preDay[1] = i;
				} else if (i == d + 1) {
					ret += s[i][before];
					preDay[0] = i;
				} else {
					if (t == before) {
						ret += s[i][t];
						preDay[0] = i;
					} else if (t == after) {
						ret += s[i][t];
						preDay[1] = i;
					}
				}
				ret -= c[before] * (i - preDay[0]);
				ret -= c[after] * (i - preDay[1]);
			}
			return ret;
		}

		void stateSwap(int d) {
			int before = this.contests[d];
			int after = this.contests[d + 1];
			this.contests[d] = after;
			this.contests[d + 1] = before;
			this.scoreC[before] = 0;
			this.scoreC[after] = 0;

			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (t == before) {
					this.scoreC[before] += s[i][t];
					preDay[0] = i;
				} else if (t == after) {
					this.scoreC[after] += s[i][t];
					preDay[1] = i;
				}
				this.scoreC[before] -= c[before] * (i - preDay[0]);
				this.scoreC[after] -= c[after] * (i - preDay[1]);
			}
		}

		int evalChange(int cd, int ct) {
			int ret = this.score;
			int before = this.contests[cd];
			ret -= this.scoreC[before];
			ret -= this.scoreC[ct];
			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (i == cd) {
					ret += s[i][ct];
					preDay[1] = i;
				} else {
					if (t == before) {
						ret += s[i][t];
						preDay[0] = i;
					} else if (t == ct) {
						ret += s[i][t];
						preDay[1] = i;
					}
				}
				ret -= c[before] * (i - preDay[0]);
				ret -= c[ct] * (i - preDay[1]);
			}
			return ret;
		}

		void stateChange(int cd, int ct) {
			int before = this.contests[cd];
			this.contests[cd] = ct;
			this.scoreC[before] = 0;
			this.scoreC[ct] = 0;

			Arrays.fill(preDay, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				if (t == before) {
					this.scoreC[before] += s[i][t];
					preDay[0] = i;
				} else if (t == ct) {
					this.scoreC[ct] += s[i][t];
					preDay[1] = i;
				}
				this.scoreC[before] -= c[before] * (i - preDay[0]);
				this.scoreC[ct] -= c[ct] * (i - preDay[1]);
			}
		}

		public Node(Node n) {
			this.score = n.score;
			this.contests = Arrays.copyOf(n.contests, D);
		}

		public int eval() {
			score = 0;
			Arrays.fill(scoreC, 0);
			Arrays.fill(preOpen, -1);
			for (int i = 0; i < D; i++) {
				int t = this.contests[i];
				score += s[i][t];
				scoreC[t] += s[i][t];
				preOpen[t] = i;
				for (int j = 0; j < T; j++) {
					int tmp = c[j] * (i - preOpen[j]);
					score -= tmp;
					scoreC[j] -= tmp;
				}
			}
			return score;
		}


		public void evalTmp(byte[][][] nowStep) {
			// TODO
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.score, o.score);
		}

	}

	// library
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

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

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
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

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	class Random {
		private long seed;
		private final long multiplier = 0x5DEECE66DL, addend = 0xBL, mask = (1L << 48) - 1;
		int bits, val;

		Random(long seed) {
			this.seed = seed;
		}

		int nextInt(int n) {
			do {
				bits = (int) ((seed = (seed * multiplier + addend) & mask) >>> 17);
				val = bits % n;
			} while (bits - val + (n - 1) < 0);
			return val;
		}

		double nextDouble() {
			return nextInt(10000000) / 10000000.0;
		}
	}

	static long TL = 1000;
	static boolean submit = true;
}
