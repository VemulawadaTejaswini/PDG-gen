import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;

	class T implements Comparable<T> {
		int v;

		T(int t) {
			v = t;
		}

		public int compareTo(T tar) {
			return tar.v - v;
		}

		@Override
		public boolean equals(Object arg0) {
			if (arg0 instanceof T) {
				return ((T) arg0).v == v;
			} else {
				return false;
			}
		}
	}

	int map[][];
	int order[][];
	LinkedList<T> l;
	LinkedList<T> r;
	LinkedList<T> d;

	LinkedList<String> answer;
	
	void dfs(int depth) {
		// System.out.println(depth + " " + n);
		if (depth == n) {
			
//			System.out.println(Arrays.deepToString(map));
			String z = "";
			for (int i = 0; i < n - 1; i++) {
				if (i != 0) {
					z += (" ");
				}
				z += (map[i][n - i - 2]);
			}
			
			if(!answer.contains(z)){
				answer.addLast(z);
			}
			return;
		}

		T cand = d.poll();
//		System.out.println(cand.v + "zz  " + r.size() + "r "+ l.size() );
		map[r.size() + 1][0] = cand.v;
		order[r.size() + 1][0] = depth;

		map[n - 1][n - r.size() - 2] = -cand.v;
		order[n - 1][n - r.size() - 2] = depth;

		boolean ok = true;
		for (int i = 0; i < n; i++) {
			if (map[n - 1][i] != 0) {
				if (n - r.size() - 2 == i) {
					continue;
				}
				if (d.contains(new T(Math.abs(cand.v + map[n - 1][i])))) {

					map[r.size() + 1][i] = cand.v + map[n - 1][i];
					map[n - i - 1][n - r.size() - 2] = -cand.v - map[n - 1][i];

					order[r.size() + 1][i] = depth;
					order[n - i - 1][n - r.size() - 2] = depth;

					d.remove(new T(Math.abs(cand.v + map[n - 1][i])));

				} else {
					ok = false;
				}
			}
		}

		if (ok) {
			r.add(cand);
			dfs(depth + 1);
			r.remove(cand);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (order[i][j] == depth) {
					if (map[i][j] > 0) {
						int ins = Collections.binarySearch(d, new T(map[i][j]));
						if (ins >= 0) {
							d.add(ins, new T(map[i][j]));
						} else {
							d.add(-ins - 1, new T(map[i][j]));
						}
					}
					order[i][j] = 0;
					map[i][j] = 0;
				}
			}
		}
		
		cand = d.poll();
		
		map[0][l.size() + 1] = cand.v;
		order[0][l.size() + 1] = depth;

		map[n - l.size() - 2][n - 1] = -cand.v;
		order[n - l.size() - 2][n - 1] = depth;

		ok = true;

		for (int i = 0; i < n; i++) {
			if (map[i][n - 1] != 0) {
				if (n - l.size() - 2 == i) {
					continue;
				}
				if (d.contains(new T(Math.abs(cand.v + map[i][n - 1])))) {

					map[i][l.size() + 1] = cand.v + map[i][n - 1];
					map[n - l.size() - 2][n - i - 1] = -cand.v - map[i][n - 1];

					order[i][l.size() + 1] = depth;
					order[n - l.size() - 2][n - i - 1] = depth;

					d.remove(new T(Math.abs(cand.v + map[i][n - 1])));

				} else {
					ok = false;
				}
			}
		}

		if (ok) {
			l.add(cand);
			dfs(depth + 1);
			l.remove(cand);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (order[i][j] == depth) {
					if (map[i][j] > 0) {
						int ins = Collections.binarySearch(d, new T(map[i][j]));
						if (ins >= 0) {
							d.add(ins, new T(map[i][j]));
						} else {
							d.add(-ins - 1, new T(map[i][j]));
						}
					}
					order[i][j] = 0;
					map[i][j] = 0;
				}
			}
		}

	}

	void run() {
		for (;;) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int m = n * (n - 1) / 2;
			d = new LinkedList<T>();

			for (int i = 0; i < m; i++) {
				d.add(new T(sc.nextInt()));
			}

			map = new int[n][n];
			order = new int[n][n];
			l = new LinkedList<T>();
			r = new LinkedList<T>();
			map[0][0] = d.poll().v;
			map[n - 1][n - 1] = -map[0][0];
			
			answer = new LinkedList<String>();
			dfs(2);
			for(String ans : answer){
				System.out.println(ans);
			}
			
			System.out.println("-----");
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}