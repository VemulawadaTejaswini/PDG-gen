import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<Q> queue = new LinkedList<Q>();
	static int min;
	static byte map[] = new byte[100000000];

	static class Q {
		int pzl;
		int cnt;

		Q (int pzl, int cnt) {
			this.pzl = pzl;
			this.cnt = cnt;
		}
	}

	public static void f() {
		while (min == -1) {
			Q q = queue.poll();
			g(q.pzl, q.cnt);
		}
	}

	public static void g(int pzl, int cnt) {
		if (pzl == 1234567) {
			min = cnt;
		} else {
			if (map[pzl] == 1) {
				return ;
			} else {
				map[pzl] = 1;
				int index = search(pzl);
				if (index == 0) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1));
					queue.add(new Q(swap(pzl, index, 2), cnt + 1));
				} else if (index == 1 || index == 2) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1));
					queue.add(new Q(swap(pzl, index, 2), cnt + 1));
					queue.add(new Q(swap(pzl, index, 3), cnt + 1));
				} else if (index == 3) {
					queue.add(new Q(swap(pzl, index, 2), cnt + 1));
					queue.add(new Q(swap(pzl, index, 3), cnt + 1));
				} else if (index == 4) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1));
					queue.add(new Q(swap(pzl, index, 4), cnt + 1));
				} else if (index == 5 | index == 6) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1));
					queue.add(new Q(swap(pzl, index, 3), cnt + 1));
					queue.add(new Q(swap(pzl, index, 4), cnt + 1));
				} else if (index == 7) {
					queue.add(new Q(swap(pzl, index, 3), cnt + 1));
					queue.add(new Q(swap(pzl, index, 4), cnt + 1));
				}
			}
		}
	}

	public static int search(int pzl) {
		for (int i = 7; 0 <= i; i--) {
			if (pzl % 10 == 0) {
				return i;
			} else {
				pzl /= 10;
			}
		}
		return -1;
	}

	public static int swap(int pzl, int index, int dir) {
		int k = 1;
		for (int i = 0; i < 7 - index; i++) {
			k *= 10;
		}
		if (dir == 1) {
			k /= 10;
			int a = (pzl / k) % 10 * k;
			pzl = pzl - a + a * 10;
		} else if (dir == 2) {
			k /= 10000;
			int a = (pzl / k) % 10 * k;
			pzl = pzl - a + a * 10000;
		} else if (dir == 3) {
			k *= 10;
			int a = (pzl / k) % 10 * k;
			pzl = pzl - a + a / 10;
		} else if (dir == 4) {
			k *= 10000;
			int a = (pzl / k) % 10 * k;
			pzl = pzl - a + a / 10000;
		}
		return pzl;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;

		while (sc.hasNext()) {
			a = 0;
			for (int i = 0; i < 8; i++) {
				a *= 10;
				a += sc.nextInt();
			}
			queue.clear();
			queue.add(new Q(a, 0));
			byte k = 0;
			Arrays.fill(map, k);
			min = -1;
			f();
			System.out.println(min);
		}
	}
}