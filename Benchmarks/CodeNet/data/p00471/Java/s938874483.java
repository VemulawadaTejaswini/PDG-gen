

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class b {

		int i;

		int j;



		b(int a, int c) {

			i = a;

			j = c;

		}



		boolean reachable(b o) {

			return this.i == o.i || this.j == o.j;

		}

	}



	String km(boolean[] a, int b) {

		int z = 0;

		for (int i = 0; i < a.length; i++) {

			z += a[i] ? 1 : 0;

			z *= 2;

		}

		return z * 100 + b + "";

	}



	int rec(boolean[] used, int now, int count, int[][] map) {

		if (ht.containsKey(km(used, now))) {

			return ht.get(km(used, now));

		}

		if (count == used.length - 1) {

			if (!list.get(now).reachable(list.get(0))){

				ht.put(km(used, now),0);

				return 0;

			}

			ht.put(km(used, now),1);

			return 1;

		}

		int sum = 0;

		int[] dx = { -1, 1, 0, 0 };

		int[] dy = { 0, 0, -1, 1 };

		b bnow = list.get(now);

		for (int i = 0; i < 4; i++) {

			int x = bnow.j;

			int y = bnow.i;

			for (;; x += dx[i], y += dy[i]) {

				if (y >= map.length || x >= map[0].length || x < 0 || y < 0) {

					break;

				}

				if (map[y][x] > 0) {

					// System.out.printf("%x ",1<<(count*4));

					// System.out.println("push"+i);

					int q = map[y][x];

					used[q] = true;

					map[y][x] = -1;

					sum += rec(used, q, count + 1, map);

					map[y][x] = q;

					// System.out.printf("%x ",1<<(count*4));

					// System.out.println("pop"+i);

					used[q] = false;

					break;

				}

			}

		}

		ht.put(km(used, now),sum);

		return sum;

	}



	LinkedList<b> list = new LinkedList<Main.b>();

	HashMap<String, Integer> ht = new HashMap<String, Integer>();



	void run() {

		for (;;) {

			int w = sc.nextInt();

			int h = sc.nextInt();

			if ((h | w) == 0) {

				break;

			}

			b start = null;

			list.clear();

			ht = new HashMap<String, Integer>();

			int[][] map = new int[h][w];

			int id = 1;

			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					map[i][j] = -1;

					int z = sc.nextInt();

					if (z == 1) {

						list.addLast(new b(i, j));

						map[i][j] = id;

						id++;

					}

					if (z == 2) {

						start = new b(i, j);

						list.addFirst(start);

						map[i][j] = 0;

					}

				}

			}

			int n = list.size();



			boolean[] used = new boolean[n];

			System.out.println(rec(used, 0, 0, map));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}