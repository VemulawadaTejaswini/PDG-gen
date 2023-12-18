import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		FIHateShortestPathProblem solver = new FIHateShortestPathProblem();
		solver.solve(1, in, out);
		out.close();
	}

	static class FIHateShortestPathProblem {
		static int INF = 10000000;

		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			TreeSet<FIHateShortestPathProblem.Interval> all = new TreeSet<>();
			TreeMap<Integer, Integer> fromCounter = new TreeMap<>();
			int totSize = 0;
			for (int i = 0; i < H; i++) {
				int from = sc.nextInt() - 1;
				int to = sc.nextInt();
				int size = to - from;
				int val = from == 0 ? INF : 1;
				FIHateShortestPathProblem.Interval tmp = new FIHateShortestPathProblem.Interval(from, size, val);
				SortedSet<FIHateShortestPathProblem.Interval> nexts = all.tailSet(tmp);
				FIHateShortestPathProblem.Interval prev = last(all.headSet(tmp));
				if (prev != null) {
					if (prev.in(from - 1)) {
						all.remove(prev);
						totSize -= prev.size;
						dec(fromCounter, prev.val);
						tmp.from = prev.from;
						tmp.size = Math.max(to, prev.from + prev.size) - prev.from;
						tmp.val = prev.val;
					}
				}

				while (!nexts.isEmpty()) {
					FIHateShortestPathProblem.Interval next = nexts.first();
					if (next.from + next.size <= tmp.from + tmp.size) {
						all.remove(next);
						totSize -= next.size;
						dec(fromCounter, next.val);
					} else if (next.from < tmp.from + tmp.size) {
						FIHateShortestPathProblem.Interval nn = next.copyFrom(tmp.from + tmp.size);
						all.remove(next);
						totSize -= next.size;
						dec(fromCounter, next.val);
						all.add(nn);
						totSize += nn.size;
						inc(fromCounter, nn.val);
						break;
					} else {
						break;
					}
				}

				all.add(tmp);
				totSize += tmp.size;
				inc(fromCounter, tmp.val);

				if (totSize < W) {
					out.println(i + 1);
				} else {
					int x = i + 1 + fromCounter.firstKey();
					out.println(x >= INF ? -1 : x);
				}
			}
		}

		static void dec(TreeMap<Integer, Integer> map, int key) {
			int newVal = map.get(key) - 1;
			if (newVal == 0) {
				map.remove(key);
			} else {
				map.put(key, newVal);
			}
		}

		static void inc(TreeMap<Integer, Integer> map, int key) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		static <T> T last(SortedSet<T> val) {
			return val.isEmpty() ? null : val.last();
		}

		static class Interval implements Comparable<FIHateShortestPathProblem.Interval> {
			int from;
			int size;
			int val;

			public Interval(int from, int size, int val) {
				this.from = from;
				this.size = size;
				this.val = val;
			}

			public int value(int pos) {
				if (!in(pos)) return -1;
				return pos - from + val;
			}

			public FIHateShortestPathProblem.Interval copyFrom(int pos) {
				return new FIHateShortestPathProblem.Interval(pos, from + size - pos, value(pos));
			}

			public boolean in(int pos) {
				return from <= pos && pos < from + size;
			}

			public int compareTo(FIHateShortestPathProblem.Interval o) {
				int cmp = Integer.compare(from, o.from);
				return cmp;
			}

			public String toString() {
				return "Interval{" +
						"from=" + from +
						", size=" + size +
						", val=" + val +
						'}';
			}

		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

