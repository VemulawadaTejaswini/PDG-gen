
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main implements Runnable{
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		// new SakuraPoetry().run();
		new Thread(null, new Main(), "", 16 * 1024L * 1024L).start();
	}

	@SuppressWarnings("unchecked")
	void solver() {
		while (true) {

			int N = ni();
			int M = ni();
			int K = ni();
			if (N == 0 && M == 0 && K == 0)
				break;
			String[] from = new String[N];
			String[] to = new String[N];
			ss = new String[2 * N];
			for (int i = 0; i < N; i++) {
				from[i] = ns();
				to[i] = ns();
				ss[2 * i] = from[i];
				ss[2 * i + 1] = to[i];
			}
			Arrays.sort(ss);
			ss = unique(ss);

			int n = ss.length;
			n++;
			g = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				g[i] = new ArrayList<>();
			}
			for (int i = 0; i < N; i++) {
				int src = Arrays.binarySearch(ss, from[i]);
				int dst = Arrays.binarySearch(ss, to[i]);
				g[src].add(dst);
			}
			for (int i = 0; i < n - 1; i++)
				g[n - 1].add(i);

			trie = new TrieByList();

			while (K-- > 0) {
				trie.add(ns().toCharArray());
			}

			trie.buildFailure();

			dp = new long[500][601][2][n];// [???????????????][trie???Node???id][??£????????????????????????][?????¨??????]
			for (int i = 0; i < dp.length; i++)
				for (int j = 0; j < dp[0].length; j++)
					for (int k = 0; k < dp[0][0].length; k++)
						for (int l = 0; l < dp[0][0][0].length; l++)
							dp[i][j][k][l] = -1;

			long ans = 0;
			ans = dfs(M, 0, 1, n - 1) % MOD;
			tr(ans);
		}
	}

	long MOD = 1_000_000_007;
	long[][][][] dp;
	ArrayList<Integer>[] g;
	String[] ss;
	TrieByList trie;

	long dfs(int len, int nodeid, int seasonWordNum, int cur) {
		if (seasonWordNum < 0 || len < 0)
			return 0;
		if (seasonWordNum == 0 && len == 0)
			return 1;
		if (dp[len][nodeid][seasonWordNum][cur] >= 0) {
			return dp[len][nodeid][seasonWordNum][cur];
		} else {
			long sum = 0;
			for (int dst : g[cur]) {
				int[] state = trie.move(ss[dst].toCharArray(), nodeid);// {nodeid,hit};
				// tr(ss[dst],state[1]);
				sum += dfs(len - ss[dst].length(), state[0], seasonWordNum - state[1], dst);
				sum %= MOD;
			}
			return (dp[len][nodeid][seasonWordNum][cur] = sum);
		}
	}

	String[] unique(String[] ss) {
		String[] ret = new String[ss.length];
		int p = 0;
		for (int i = 0; i < ss.length; i++) {
			if (i == 0 || !ss[i].equals(ss[i - 1])) {
				ret[p] = ss[i];
				p++;
			}
		}
		return Arrays.copyOf(ret, p);
	}

	class TrieByList {
		Node[] list = new Node[601];
		Node root = new Node(0, (char) 0);
		int gen = 1;

		public TrieByList() {
			list[gen - 1] = root;
		}

		class Node {
			int id;
			char c;
			Node[] child = null;
			int p = 0;
			int ptn = 0;
			Node fail;
			int hit = 0;

			public Node(int id, char c) {
				this.id = id;
				this.c = c;
			}

			Node search(char c) {
				if (ptn << 31 - (c - 'a') < 0) {
					return child[Integer.bitCount(ptn << 31 - (c - 'a')) - 1];
				} else
					return null;
			}

			void appendChild(Node n) {
				if (p == 0) {
					child = new Node[1];
				} else if (p + 1 > child.length) {
					child = Arrays.copyOf(child, 2 * child.length);
				}
				int z = n.c - 'a';
				int zind = Integer.bitCount(ptn << 31 - z);
				System.arraycopy(child, zind, child, zind + 1, p - zind);
				ptn |= 1 << z;
				child[zind] = n;
				p++;
			}
		}

		void buildFailure() {
			root.fail = null;
			Queue<Node> q = new ArrayDeque<>();
			q.add(root);
			while (!q.isEmpty()) {
				Node cur = q.poll();
				inner: for (int i = 0; i < cur.p; i++) {
					Node ch = cur.child[i];
					q.add(ch);
					for (Node to = cur.fail; to != null; to = to.fail) {
						Node next = to.search(ch.c);
						if (next != null) {
							ch.fail = next;
							ch.hit += next.hit;
							continue inner;
						}
					}
					ch.fail = root;
				}
			}
		}

		void add(char[] s) {
			Node cur = root;
			Node pre = null;
			for (char c : s) {
				pre = cur;
				cur = pre.search(c);
				if (cur == null) {
					cur = new Node(gen++, c);
					list[gen - 1] = cur;
					pre.appendChild(cur);
				}
			}
			cur.hit++;
		}

		int countHit(char[] s) {
			Node cur = root;
			int hit = 0;
			outer: for (char c : s) {
				for (; cur != null; cur = cur.fail) {
					Node next = cur.search(c);
					if (next != null) {
						hit += next.hit;
						cur = next;
						continue outer;
					}
				}
				cur = root;
			}
			return hit;
		}

		int[] move(char[] s, int curid) {
			Node cur = list[curid];
			int hit = 0;
			outer: for (char c : s) {
				for (; cur != null; cur = cur.fail) {
					Node next = cur.search(c);
					if (next != null) {
						hit += next.hit;
						cur = next;
						continue outer;
					}
				}
				cur = root;
			}
			return new int[] { cur.id, hit };
		}
	}

	@Override
	public void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver();
		out.flush();

	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}