import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	E[] map;

	class E {
		LinkedList<V> from = new LinkedList<V>();
		LinkedList<V> to = new LinkedList<V>();
	}

	class V {
		int cap;
		int flow;

		int from;
		int to;

		V(int from, int to, int cap, int flow) {
			this.from = from;
			this.to = to;
			this.cap = cap;
			this.flow = flow;
		}
	}

	int dfs(LinkedList<V> p, boolean used[], int now, int goal) {
		used[now] = true;
		if (now == goal) {
			return 1;
		}
		for (V v : map[now].to) {
			// if (v.from == now) {
			if (v.cap - v.flow > 0) {
				if (!used[v.to]) {
					used[v.to] = true;
					v.flow++;
					int res = dfs(p, used, v.to, goal);
					if (res == 1) {
						return 1;
					}
					v.flow--;
					used[v.to] = false;
				}
			}
			// }
		}
		for (V v : map[now].from) {
			// if (v.to == now) {
			if (v.flow > 0) {
				if (!used[v.from]) {
					used[v.from] = true;
					v.flow--;
					int res = dfs(p, used, v.from, goal);
					if (res == 1) {
						return 1;
					}
					v.flow++;
					used[v.from] = false;
				}
			}
		}

		return 0;
	}

	int maxFlow(LinkedList<V> map, int s, int t) {
		int res = 0;
		for (;;) {
			int d = dfs(map, new boolean[t + 1], s, t);
			if (d == 0) {
				break;
			}
			res += d;
		}

		return res;
	}

	void run() {
		for (;;) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int nw = sc.nextInt();
			int nc = sc.nextInt();
			int nm = sc.nextInt();

			if ((h & w & c & m & nm & nw & nc) < 0) {
				break;
			}

			int[] H = new int[h];
			int[] W = new int[2 * w];
			int[] C = new int[2 * c];
			int[] M = new int[m * 2];
			for (int i = 0; i < h; i++) {
				H[i] = i;
			}
			for (int i = 0; i < 2 * w; i++) {
				W[i] = i + h;
			}
			for (int i = 0; i < 2 * c; i++) {
				C[i] = i + h + 2 * w;
			}
			for (int i = 0; i < m * 2; i++) {
				M[i] = i + h + 2 * w + 2 * c;
			}
			int NM = h + 2 * w + 2 * c + m * 2;
			int NM2 = h + 2 * w + 2 * c + m * 2 + 1;
			int NW = h + 2 * w + 2 * c + m * 2 + 2;
			int NW2 = h + 2 * w + 2 * c + m * 2 + 3;
			int NC = h + 2 * w + 2 * c + m * 2 + 4;
			int NC2 = h + 2 * w + 2 * c + m * 2 + 5;
			int S = h + 2 * w + 2 * c + m * 2 + 6;
			int T = h + 2 * w + 2 * c + m * 2 + 7;
			map = new E[h + 2 * w + 2 * c + m * 2 + 8];
			for(int i = 0; i < map.length; i++){
				map[i] = new E();
			}
			LinkedList<V> edge = new LinkedList<V>();
			for (int i = 0; i < h; i++) {
				{
					V a = new V(S, H[i], 1, 0);
					map[S].to.add(a);
					map[H[i]].from.add(a);
				}
				{
					V a = new V(H[i], NW, 1, 0);
					map[H[i]].to.add(a);
					map[NW].from.add(a);
				}
			}

			for (int from = 0; from < w; from++) {
				int z = sc.nextInt();
				for (int i = 0; i < z; i++) {
					int tar = sc.nextInt() - 1;
					{
						V a = new V(H[tar], W[from], 1, 0);
						map[H[tar]].to.add(a);
						map[W[from]].from.add(a);
					}
				}
			}

			{
				V a = new V(NW, NW2, nw, 0);
				map[NW].to.add(a);
				map[NW2].from.add(a);
			}
			for (int i = 0; i < w; i++) {
				{
					V a = new V(W[i], W[i + w], 1, 0);
					map[W[i]].to.add(a);
					map[W[i + w]].from.add(a);
				}
				{
					V a = new V(W[i + w], NC, 1, 0);
					map[W[i + w]].to.add(a);
					map[NC].from.add(a);
				}
			}
			{
				V a = new V(NW2, NC, Math.min(nc, nw), 0);
				map[NW2].to.add(a);
				map[NC].from.add(a);
			}

			for (int from = 0; from < c; from++) {
				int z = sc.nextInt();
				for (int i = 0; i < z; i++) {
					int tar = sc.nextInt() - 1;
					{
						V a = new V(W[tar + w], C[from], 1, 0);
						map[W[tar + w]].to.add(a);
						map[C[from]].from.add(a);
					}
				}
			}
			{
				V a = new V(NC, NC2, nc, 0);
				map[NC].to.add(a);
				map[NC2].from.add(a);
			}
			for (int i = 0; i < c; i++) {
				{
					V a = new V(NW2, C[i], 1, 0);
					map[NW2].to.add(a);
					map[C[i]].from.add(a);
				}
				{
					V e = new V(C[i], C[i + c], 1, 0);
					map[C[i]].to.add(e);
					map[C[i + c]].from.add(e);
				}
				{
					V e = new V(C[i + c], NM, 1, 0);
					map[C[i + c]].to.add(e);
					map[NM].from.add(e);
				}
			}
			{
				V e = new V(NC2, NM, Math.min(nc, nm), 0);
				map[NC2].to.add(e);
				map[NM].from.add(e);
			}
			for (int from = 0; from < m; from++) {
				int z = sc.nextInt();
				for (int i = 0; i < z; i++) {
					int tar = sc.nextInt() - 1;
					{
						V e = new V(C[tar + c], M[from], 1, 0);
						map[C[tar + c]].to.add(e);
						map[M[from]].from.add(e);
					}
				}
			}

			for (int i = 0; i < m; i++) {
				{
					V e = new V(NC2, M[i], 1, 0);
					map[NC2].to.add(e);
					map[M[i]].from.add(e);
				}
				{
					V e = new V(M[i], M[i + m], 1, 0);
					map[M[i]].to.add(e);
					map[M[i + m]].from.add(e);
				}
				{
					V e = new V(M[i + m], T, 1, 0);
					map[M[i + m]].to.add(e);
					map[T].from.add(e);
				}
			}
			{
				V e = new V(NM2, T, nw, 0);
				map[NM2].to.add(e);
				map[T].from.add(e);
			}
			{
				V e = new V(NM, NM2, nm, 0);
				map[NM].to.add(e);
				map[NM2].from.add(e);
			}
			int res = maxFlow(edge, S, T);
			System.out.println(res);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}