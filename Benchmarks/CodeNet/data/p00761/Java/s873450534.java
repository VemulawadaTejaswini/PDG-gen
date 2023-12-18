import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		new A1180().ans(sc);
	}

}

class Code {

}

class A1130 {

	int[] xdis = { -1, 0, +1, 0 };
	int[] ydis = { 0, -1, 0, +1 };

	int[][] cm;

	public void ans(Scanner sc) {
		while (true) {
			String str = sc.nextLine();
			String[] cut = str.split(" ");
			int W = Integer.parseInt(cut[0], 10);
			int H = Integer.parseInt(cut[1], 10);

			if (W == 0) {
				break;
			}

			cm = new int[H][W];

			int x = 0;
			int y = 0;
			for (int h = 0; h < H; h++) {
				String map = sc.nextLine();
				for (int w = 0; w < W; w++) {
					char c = map.charAt(w);
					switch (c) {
					case '.':
						cm[h][w] = 0;
						break;
					case '@':
						x = w;
						y = h;
						cm[h][w] = 0;
						break;
					case '#':
						cm[h][w] = -1;
						break;
					}
				}
			}
			rec(x, y);

			int count = 0;
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (cm[h][w] == 1) {
						count++;
					}
				}
			}
			System.out.println(count);

		}
	}

	void rec(int x, int y) {
		if (y < 0 || cm.length <= y) {
			return;
		}
		if (x < 0 || cm[0].length <= x) {
			return;
		}
		if (cm[y][x] != 0) {
			return;
		}

		cm[y][x] = 1;
		for (int i = 0; i < xdis.length; i++) {
			rec(x + xdis[i], y + ydis[i]);
		}
	}
}

class A1141 {
	boolean[] ss;

	public void ans(Scanner sc) {
		ss = new boolean[1000000];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = true;
		}
		ss[0] = false;
		ss[1] = false;

		for (int i = 4; i < ss.length; i += 2) {
			ss[i] = false;
		}

		for (int i = 3; i < ss.length / 2; i += 2) {
			if (ss[i]) {
				for (int j = 2; i * j < ss.length; j++) {
					ss[i * j] = false;
				}
			}
		}

		while (true) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();

			if (a == 0) {
				break;
			}

			int c = 0;
			int i;
			for (i = 0;; i++) {
				//				System.out.println(a+i*d);
				if (ss[a + i * d]) {
					c++;
				}
				if (c == n) {
					System.out.println(a + i * d);
					break;
				}
			}
		}
	}

}

class A1166 {
	LinkedList<Node> list;

	public void ans(Scanner sc) {
		while (true) {
			int W = sc.nextInt();
			int H = sc.nextInt();

			if (W == 0) {
				break;
			}

			list = new LinkedList<A1166.Node>();
			for (int i = 0; i < W * H; i++) {
				list.add(new Node());
			}

			for (int h = 0; h < (H * 2 - 1); h++) {
				int hh = (h / 2) * W;
				if (h % 2 == 0) {
					for (int w = 0; w < W - 1; w++) {
						int x = sc.nextInt();
						if (x == 0) {
							list.get(hh + w).addTo(hh + w + 1);
							list.get(hh + w + 1).addTo(hh + w);
						}
					}
				} else {
					for (int w = 0; w < W; w++) {
						int x = sc.nextInt();
						if (x == 0) {
							list.get(hh + w).addTo(hh + w + W);
							list.get(hh + w + W).addTo(hh + w);
						}
					}

				}
			}

			rec(0, 1);

			int ans = list.getLast().getTmp();

			if (ans == Integer.MAX_VALUE) {
				System.out.println(0);
			} else {
				System.out.println(list.getLast().getTmp());
			}
		}
	}

	void rec(int c, int cost) {
		Node n = list.get(c);

		if (cost < n.getTmp()) {
			n.setTmp(cost);
			LinkedList<Integer> li = n.getToList();
			for (Iterator iterator = li.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				rec(integer, cost + 1);
			}
		}

	}

	class Node {
		LinkedList<Integer> toList;
		int tmp;

		Node() {
			toList = new LinkedList<Integer>();
			tmp = Integer.MAX_VALUE;
		}

		void addTo(int to) {
			toList.add(to);
		}

		public LinkedList<Integer> getToList() {
			return toList;
		}

		public void setTmp(int tmp) {
			this.tmp = tmp;
		}

		public int getTmp() {
			return tmp;
		}
	}

}

class A1180 {

	public void ans(Scanner sc) {
		while (true) {
			int A = sc.nextInt();
			int L = sc.nextInt();

			if (A == 0 && L == 0) {
				break;
			}

			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(A);

			while (true) {
				int a = list.getLast();
				int ind = list.indexOf(a);
				if (ind != list.size() - 1) {
					System.out.printf("%d %d %d\n", ind, a, ((list.size() - 1)-ind));
					break;
				}

				int[] nums = new int[10];
				int l = L - (int) Math.log10(a) - 1;
				if(a==0){
					l=L;
				}
				nums[0] += l;
				for (int i = 0; i < L - l; i++) {
					nums[a % 10]++;
					a /= 10;
				}

				StringBuilder min = new StringBuilder("");
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < nums[i]; j++) {
						min.append(i);
					}
				}

				String max = min.reverse().toString();
				min.reverse();

				int ans = Integer.parseInt(max) - Integer.parseInt(min.toString());

				list.add(ans);

			}
		}
	}
}