import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			String packageName = new Main().getClass().getPackage().getName();
			System.setIn(new FileInputStream("src/" + packageName + "/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/" + packageName + "/result.txt")));
		} catch (FileNotFoundException e) {
		} catch (NullPointerException e) {
		}
		new Main().run();
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t --> 0) solve();

	}
	void solve() {
		int n = sc.nextInt() + 1;
		int m = sc.nextInt();

		int sa = sc.nextInt();
		int sb = sc.nextInt();

		ArrayList<ArrayList<E>> g = new ArrayList<ArrayList<E>>();
		for (int i = 0; i < n; i++) g.add(new ArrayList<E>());

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int t = sc.next().charAt(0);
			g.get(a).add(new E(b, t));
			g.get(b).add(new E(a, t));
		}

		int ans = inf;

		int[] catOnly = dijk(g, sb, 'L', true);
		if (catOnly[0] == 0) ans = 0;

		int[] fromGoal = dijk(g, 0, 'L', true);
		int[] fromCat = dijk(g, sb, 'L', true);
		int[] fromMan = dijk(g, sa, 'X', false);

		for (int i = 0; i < n; i++) {
			ans = min(ans, fromGoal[i] + fromCat[i] + fromMan[i]);
		}

		System.out.println(ans);
	}

	int inf = Integer.MAX_VALUE / 5;

	int[] dijk(ArrayList<ArrayList<E>> g, int s, int type, boolean strict) {
		int n = g.size();
		int[] res = new int[n];
		fill(res, inf);
		res[s] = 0;
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		while (!q.isEmpty()) {
			int here = q.pollFirst();

			for (E e : g.get(here)) {
				int ncost = 0;
				if (strict) {
					if (e.type == type) {
						ncost = res[here] + (res[here] > 0 ? inf : 0);
					} else {
						ncost = res[here] + 1;
					}
				}
				else {
					ncost = (res[here]) + (e.type == type ? 0 : 1);
				}
				if (res[e.to] > ncost) {
					res[e.to] = ncost;
					if (e.type == type)
						q.addFirst(e.to);
					else
						q.addLast(e.to);
				}
			}
		}
		return res;
	}

	class E {
		public E(int to, int type) {
			this.to = to;
			this.type = type;
		}
		int to;
		int type;
	}

}