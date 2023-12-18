import java.util.*;

class C implements Runnable {
	static final int INF = 1 << 20;

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
			int m = sc.nextInt();
			V s = new V(), p = new V(), g = new V();
			Map<String, V> map = new HashMap<String, V>();
			map.put(sc.next(), s);
			map.put(sc.next(), p);
			map.put(sc.next(), g);
			for (int i = 0; i < m; i++) {
				String a = sc.next(), b = sc.next();
				if (!map.containsKey(a))
					map.put(a, new V());
				if (!map.containsKey(b))
					map.put(b, new V());
				int d = sc.nextInt();
				int t = sc.nextInt();
				map.get(a).add(new E(map.get(b), d / 40 + t));
				map.get(b).add(new E(map.get(a), d / 40 + t));
			}
			NavigableSet<V> set = new TreeSet<V>();
			s.dist = 0;
			set.add(s);
			while (!set.isEmpty()) {
				V v = set.pollFirst();
				if (v == p)
					break;
				for (E e : v)
					if (v.dist + e.dist < e.to.dist) {
						set.remove(e.to);
						e.to.dist = v.dist + e.dist;
						set.add(e.to);
					}
			}
			set.clear();
			for (V v : map.values())
				if (v != p)
					v.dist = INF;
			set.add(p);
			while (!set.isEmpty()) {
				V v = set.pollFirst();
				if (v == g)
					break;
				for (E e : v)
					if (v.dist + e.dist < e.to.dist) {
						set.remove(e.to);
						e.to.dist = v.dist + e.dist;
						set.add(e.to);
					}
			}
			System.out.println(g.dist);
		}
	}

	static class E {
		final V to;
		final int dist;

		public E(V to, int dist) {
			this.to = to;
			this.dist = dist;
		}
	}

	static class V extends ArrayList<E> implements Comparable<V> {
		static int nid = 0;
		final int id = nid++;
		int dist = INF;

		@Override
		public int compareTo(V o) {
			if (dist == o.dist)
				return id - o.id;
			return dist - o.dist;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		new C().run();
	}
}