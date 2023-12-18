import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	class Node implements Comparable<Node> {
		int p, t;
		int j = 0;
		String s;

		Node(int p, int t) {
			this.p = p;
			this.t = t;
		}

		Node(int p, int t, String s) {
			this.p = p;
			this.t = t;
			this.s = s;
		}

		public int compareTo(Node tar) {
			return this.t - tar.t;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if ((n | m | l) == 0)
				break;
			n++;
			int d[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], Integer.MAX_VALUE / 4);
			}
			for (int i = 0; i < m; i++) {
				int u = sc.nextInt() + 1;
				int v = sc.nextInt() + 1;
				d[u][v] = d[v][u] = sc.nextInt();
			}
			Node[] req = new Node[l];
			for (int i = 0; i < l; i++) {
				req[i] = new Node(sc.nextInt() + 1, sc.nextInt());
			}
			Arrays.sort(req);

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				d[0][i] = 0;
			}

			boolean r[][] = new boolean[n][n];

			for (int i = 0; i < l; i++) {
				for (int j = i + 1; j < l; j++) {
					r[req[i].p][req[j].p] = d[req[i].p][req[j].p] <= -req[i].t
							+ req[j].t;
					// System.out.println(i+" "+j+" " + r[req[i].p][req[j].p]);
				}
			}
			for (int i = 0; i < n; i++) {
				r[0][i] = true;
			}

			int max = n;
			int min = 0;
			for (;;) {
				if (max == min)
					break;
				int mid = (max + min) / 2;
				TreeSet<String> used = new TreeSet<String>();
				String state = "";
				for (int i = 0; i < mid; i++) {
					state += "00";
				}
				PriorityQueue<Node> q = new PriorityQueue<Node>();
//				Queue<Node> q = new LinkedList<Node>();
				q.add(new Node(0, 0, state));
				boolean check = false;
				for (; !q.isEmpty();) {
					Node c = q.poll();
		//			System.out.println(c.s);
					if (c.j == l) {
						max = mid;
						check = true;
						break;
					}
					if (used.contains(c.s))
						continue;
					used.add(c.s);
					for (int i = 0; i < mid; i++) {
						String sub = c.s.substring(i * 2, i * 2 + 2);
						int pos = Integer.valueOf(sub,16);
						if (r[pos][req[c.j].p]) {
							String a = c.s.substring(0, i * 2);
							String b = c.s.substring(i * 2 + 2, c.s.length());
							String newS = a + String.format("%03x", req[c.j].p)
									+ b;
					//		if (!used.contains(newS)) {
								Node sa = new Node(0, 0, newS);
								sa.j = c.j + 1;
								q.add(sa);
						//	}
						}
					}
				}
				if (!check)
					min = mid + 1;
			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}