import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	static int w;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		w = Integer.parseInt(sa[1]);
		int[] a = new int[h];
		int[] b = new int[h];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		TreeSet<Obj> set = new TreeSet<>();
		for (int i = 0; i < w; i++) {
			map.put(i, i);
			set.add(new Obj(i, i, 0));
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < h; i++) {
			SortedMap<Integer, Integer> sub = map.subMap(a[i], b[i]);
			for (Integer key : sub.keySet()) {
				int s = sub.get(key);
				set.remove(new Obj(s, key, key - s));
			}
			if (!map.containsKey(b[i])) {
				if (!sub.isEmpty()) {
					int s = sub.get(sub.lastKey());
					map.put(b[i], s);
					set.add(new Obj(s, b[i], b[i] - s));
				}
			}
			sub.clear();
			int ans = set.first().d;
			if (ans == Integer.MAX_VALUE) {
				pw.println(-1);
			} else {
				pw.println(set.first().d + i + 1);
			}
		}
		pw.flush();
	}

	static class Obj implements Comparable<Obj> {
		int s, e, d;

		public Obj(int s, int e, int d) {
			this.s = s;
			this.e = e;
			if (e == w) {
				this.d = Integer.MAX_VALUE;
			} else {
				this.d = d;
			}
		}

		@Override
		public int compareTo(Obj o) {
			if (d != o.d) {
				return d - o.d;
			}
			return e - o.e;
		}
	}
}
