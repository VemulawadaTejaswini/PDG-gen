import java.util.*;

class D implements Runnable {
	static final int INF = 1 << 20;

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int w = sc.nextInt(); w > 0; w = sc.nextInt()) {
			int h = sc.nextInt();
			Map<Integer, List<V>> ll = new HashMap<Integer, List<V>>();
			V g = null;
			int max = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					String st = sc.next();
					if (Character.isDigit(st.charAt(0))) {
						int num = Integer.parseInt(st);
						if (!ll.containsKey(num))
							ll.put(num, new ArrayList<V>());
						ll.get(num).add(new V(i, j));
						max = Math.max(max, num);
					} else
						switch (st.charAt(0)) {
						case 'S':
							ll.put(0, new ArrayList<V>());
							ll.get(0).add(new V(i, j));
							break;
						case 'G':
							g = new V(i, j);
							break;
						case '.':
							break;
						default:
							throw null;
						}
				}
			ll.put(max + 1, new ArrayList<V>());
			ll.get(max + 1).add(g);
			for(V v : ll.get(0))
				v.dist = 0;
			for (int i = 0; ll.containsKey(i + 1); i++) {
				for (V v1 : ll.get(i))
					for (V v2 : ll.get(i + 1)) {
						int d = v1.dist(v2);
						if (v1.dist + d < v2.dist)
							v2.dist = v1.dist + d;
					}
			}
			System.out.println(g.dist);
		}
	}

	class V {
		final int x, y;
		int dist = INF;

		public V(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int dist(V v) {
			return Math.abs(x - v.x) + Math.abs(y - v.y);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		new D().run();
	}
}