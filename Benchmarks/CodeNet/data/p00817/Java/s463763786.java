import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			if (n == 0 && p1 == 0 && p2 == 0)
				break;
			if (p1 == p2) {
				for (int i = 0; i < n; i++) {
					int x = sc.nextInt(), y = sc.nextInt();
					String a = sc.next();
				}
				System.out.println("no");
				continue;
			} else {
				DJSet ds = new DJSet(2 * (p1 + p2));
				for (int i = 0; i < n; i++) {
					int x = sc.nextInt() - 1;
					int y = sc.nextInt() - 1;
					String a = sc.next();
					if (a.equals("yes")) {
						ds.setUnion(x, y);
						ds.setUnion(x + p1 + p2, y + p1 + p2);
					} else if (a.equals("no")) {
						ds.setUnion(x, y + p1 + p2);
						ds.setUnion(x + p1 + p2, y);
					} else {
						throw new AssertionError();
					}
				}
				int[] root = new int[2 * (p1 + p2)];
				int UNUSED = 999999999;
				Arrays.fill(root, UNUSED);
				ArrayList<Pair> list = new ArrayList<>();
				for (int i = 0; i < 2 * (p1 + p2); i++) {
					if (root[i] == UNUSED) {
						int root_ = ds.root(i);
						int ct_true = 0;
						int ct_false = 0;
						for (int j = root_; j != -1; j = ds.next[j]) {
							root[j] = root_;
							root[(j + p1 + p2) % (2 * (p1 + p2))] = -root_;
							if (j < p1 + p2) {
								ct_true++;
							} else {
								ct_false++;
							}
						}
						list.add(new Pair(root[i], ct_true, ct_false));
					}
				}
				ArrayList<Integer>[] curdist = new ArrayList[p1 + 1];
				ArrayList<Integer>[] nextdist = new ArrayList[p1 + 1];

				for (int i = 0; i <= p1; i++) {
					curdist[i] = new ArrayList<>();
					nextdist[i] = new ArrayList<>();
				}
				int GARBAGE = 123456789;
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < curdist.length; j++) {
						if (!(i == 0 && j == 0) && (curdist[j].isEmpty()))
							continue;
						if (j + list.get(i).size1 <= p1) {
							if (nextdist[j + list.get(i).size1].size() == 0) {
								nextdist[j + list.get(i).size1].addAll(curdist[j]);
								nextdist[j + list.get(i).size1].add(list.get(i).root);
							} else {
								nextdist[j + list.get(i).size1].clear();
								nextdist[j + list.get(i).size1].add(GARBAGE);
							}
						}
						if (j + list.get(i).size2 <= p1) {
							if (nextdist[j + list.get(i).size2].size() == 0) {
								nextdist[j + list.get(i).size2].addAll(curdist[j]);
								nextdist[j + list.get(i).size2].add(list.get(i).root + 10000);
							} else {
								nextdist[j + list.get(i).size2].clear();
								nextdist[j + list.get(i).size2].add(GARBAGE);
							}
						}
					}
					for (int j = 0; j < curdist.length; j++) {
						curdist[j].clear();
						curdist[j].addAll(nextdist[j]);
						nextdist[j].clear();
					}
				}

				if (curdist[p1].isEmpty() || curdist[p1].get(0) == GARBAGE) {
					System.out.println("no");
				} else {
					ArrayList<Integer> ans = new ArrayList<>();
					for (int j = 0; j < curdist[p1].size(); j++) {
						int root_ = curdist[p1].get(j);
						for (int k = (root_ >= 10000 ? (root_ - 10000) : root_); k != -1; k = ds.next[k]) {
							if (root_ < 10000 && k < p1 + p2) {
								ans.add(k);
							} else if (root_ >= 10000 && k >= p1 + p2) {
								ans.add(k - p1 - p2);
							}
						}
					}
					ans.sort(null);
					for (int j = 0; j < ans.size(); j++) {
						System.out.println(ans.get(j) + 1);
					}
					System.out.println("end");
				}

			}
		}
	}

	class Pair {
		int root;
		int size1;
		int size2;
		boolean rev = false;

		public Pair(int root, int size1, int size2) {
			this.root = root;
			this.size1 = size1;
			this.size2 = size2;
		}
	}

	class DJSet {
		int n;
		int[] upper;
		int[] next;
		int[] last;

		public DJSet(int n) {
			this.n = n;
			upper = new int[n];
			next = new int[n];
			last = new int[n];
			Arrays.fill(upper, -1);
			Arrays.fill(next, -1);
			for (int i = 0; i < n; i++) {
				last[i] = i;
			}
		}

		boolean setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (upper[x] > upper[y]) {
					int tmp = x;
					x = y;
					y = tmp;
				}
				// y??????????????????????????????????????????
				upper[y] += upper[x];
				upper[x] = y;
				next[last[y]] = x;
				last[y] = last[x];
			}
			return x != y;
		}

		int root(int x) {
			if (upper[x] < 0)
				return x;
			else {
				return (upper[x] = root(upper[x]));
			}
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		int count_connected_components() {
			int ret = 0;
			for (int i = 0; i < n; i++) {
				if (upper[i] < 0) {
					ret++;
				}
			}
			return ret;
		}
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}