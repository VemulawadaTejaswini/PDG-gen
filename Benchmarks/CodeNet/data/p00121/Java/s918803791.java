import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<Q> queue = new LinkedList<Q>();
	static int min;
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static class Q {
		int pzl;
		int cnt;
		int pre;

		Q (int pzl, int cnt, int pre) {
			this.pzl = pzl;
			this.cnt = cnt;
			this.pre = pre;
		}
	}

	public static void f() {
		while (min == -1) {
			Q q = queue.poll();
			g(q.pzl, q.cnt, q.pre);
		}
	}

	public static void g(int pzl, int cnt, int pre) {
		if (pzl == 1234567) {
			min = cnt;
		} else {
			if (map.get(pzl) != null) {
				return ;
			} else {
				map.put(pzl, 1);
			}
			int index = search(pzl);
			if (index == 0) {
				if (pre != 1) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1, 3));
				}
				if (pre != 2) {
					queue.add(new Q(swap(pzl, index, 2), cnt + 1, 4));
				}
			} else if (index == 1 || index == 2) {
				if (pre != 1) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1, 3));
				}
				if (pre != 2) {
					queue.add(new Q(swap(pzl, index, 2), cnt + 1, 4));
				}
				if (pre != 3) {
					queue.add(new Q(swap(pzl, index, 3), cnt + 1, 1));
				}
			} else if (index == 3) {
				if (pre != 2) {
					queue.add(new Q(swap(pzl, index, 2), cnt + 1, 4));
				}
				if (pre != 3) {
					queue.add(new Q(swap(pzl, index, 3), cnt + 1, 1));
				}
			} else if (index == 4) {
				if (pre != 1) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1, 3));
				}
				if (pre != 4) {
					queue.add(new Q(swap(pzl, index, 4), cnt + 1, 2));
				}
			} else if (index == 5 | index == 6) {
				if (pre != 1) {
					queue.add(new Q(swap(pzl, index, 1), cnt + 1, 3));
				}
				if (pre != 3) {
					queue.add(new Q(swap(pzl, index, 3), cnt + 1, 1));
				}
				if (pre != 4) {
					queue.add(new Q(swap(pzl, index, 4), cnt + 1, 2));
				}
			} else if (index == 7) {
				if (pre != 3) {
					queue.add(new Q(swap(pzl, index, 3), cnt + 1, 1));
				}
				if (pre != 4) {
					queue.add(new Q(swap(pzl, index, 4), cnt + 1, 2));
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
			queue.add(new Q(a, 0, 0));
			min = -1;
			f();
			System.out.println(min);
		}
	}
}