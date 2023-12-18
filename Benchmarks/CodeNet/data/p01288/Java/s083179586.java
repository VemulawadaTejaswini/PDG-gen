import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static FastScanner sc = new FastScanner(System.in);
	static final int POP = 10000000;
	static final int INF = 1 << 30;
	static int N, Q;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			Q = sc.nextInt();
			System.out.println(solve());
		}
	}

	static long solve() {
		ArrayList<ArrayList<Integer>> child = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> query = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N; ++i) {
			child.add(new ArrayList<Integer>());
			query.add(new ArrayList<Integer>());
		}
		for (int i = 1; i < N; ++i) {
			int p = sc.nextInt() - 1;
			child.get(p).add(i);
		}
		ArrayList<Integer> node = new ArrayList<Integer>();
		ArrayList<Integer> sort = new ArrayList<Integer>();
		node.add(0);
		while (!node.isEmpty()) {
			int cur = node.get(node.size() - 1);
			node.remove(node.size() - 1);
			sort.add(cur);
			if (cur >= POP) {
				continue;
			}
			node.add(POP + cur);
			for (int i = child.get(cur).size() - 1; i >= 0; --i) {
				node.add(child.get(cur).get(i));
			}
		}

		int[] mark = new int[N];
		mark[0] = -1;
		Arrays.fill(mark, INF);
		for (int i = 0; i < Q; ++i) {
			char type = sc.nextChar();
			int n = sc.nextInt() - 1;
			if (type == 'Q') {
				query.get(n).add(i);
			} else {
				mark[n] = Math.min(i, mark[n]);
			}
		}

		int[] time = new int[N];
		int[] markedNode = new int[N];
		int[] pos = new int[N];
		int[] prevTime = new int[N];
		int[] prevMarkedNode = new int[N];
		int[] prevSize = new int[N];
		time[0] = -1;
		markedNode[0] = 0;
		int size = 1;
		long ans = 0;
		for (int i = 1; i < 2 * N; ++i) {
			int cur = sort.get(i);
			if (cur >= POP) {
				cur -= POP;
				if (mark[cur] != INF) {
					time[pos[cur]] = prevTime[cur];
					markedNode[pos[cur]] = prevMarkedNode[cur];
					size = prevSize[cur];
				}
			} else {
				for (int q : query.get(cur)) {
					int lo = 0;
					int hi = size;
					while (lo + 1 < hi) {
						int mi = (lo + hi) / 2;
						if (q < time[mi]) {
							hi = mi;
						} else {
							lo = mi;
						}
					}
					ans += markedNode[lo] + 1;
				}
				if (mark[cur] != INF) {
					prevSize[cur] = size;
					int left = 0;
					int right = size;
					while (left + 1 < right) {
						int mid = (left + right) / 2;
						if (mark[cur] < time[mid]) {
							right = mid;
						} else {
							left = mid;
						}
					}
					pos[cur] = right;
					prevTime[cur] = time[right];
					prevMarkedNode[cur] = markedNode[right];
					time[right] = mark[cur];
					markedNode[right] = cur;
					size = right + 1;
				}
			}
		}

		return ans;
	}

	static class FastScanner {
		Reader input;

		FastScanner() {
			this(System.in);
		}

		FastScanner(InputStream stream) {
			this.input = new BufferedReader(new InputStreamReader(stream));
		}

		int nextInt() {
			try {
				int sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				int ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) return ret * sign;
					ret *= 10;
					ret += b - '0';
				}
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}

		char nextChar() {
			try {
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				return (char) b;
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}
	}

}