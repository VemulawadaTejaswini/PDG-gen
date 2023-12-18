
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class E {
		int sum;
		int start;
		int end;

		E(int s, int end, int sum) {
			this.start = s;
			this.end = end;
			this.sum = sum;
		}
	}

	class list {
		LinkedList<E> list;

		public list() {
			list = new LinkedList<E>();
		}
	}

	void run() {
		for (;;) {
			int N, M;
			N = sc.nextInt();
			M = sc.nextInt();
			if ((N | M) == 0) {
				break;
			}

			list[] data = new list[M];
			int[] start = new int[N];
			int[] sum = new int[M];
			for (int i = 0; i < M; i++) {
				data[i] = new list();
				data[i].list.add(new E(0, 0, 0));
			}
			int using[] = new int[M];
			int r = sc.nextInt();
			for (int i = 0; i < r; i++) {
				int t = sc.nextInt();
				int n = sc.nextInt() - 1;
				int m = sc.nextInt() - 1;
				int s = sc.nextInt();
				if (s == 1) {
					if (using[m] == 0) {
						start[m] = t;
					}
					using[m]++;
				} else {
					using[m]--;
					if (using[m] == 0) {
						data[m].list.add(new E(start[m], t, sum[m]));
						sum[m] += t - start[m];
					}
				}
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int t = sc.nextInt();
				int t2 = sc.nextInt();
				int m = sc.nextInt() - 1;

				int ret;
				int left = 0;
				int right = data[m].list.size();
				int premid = -1;
				for (;;) {
					int mid = (left + right) / 2;
					E cand = data[m].list.get(mid);
					if (premid == mid) {
//						System.err.println("start from " + cand.start + " "
//								+ cand.end + " " + cand.sum);
						ret = -cand.sum;
						break;
					}
					if (cand.start > t) {
						right = mid;
					} else if (cand.end < t) {
						left = mid;
					} else {
//						System.err.println("start from " + cand.start + " "
//								+ cand.end + " " + cand.sum);
						ret = -(cand.sum + t - cand.start);
						break;
					}
					premid = mid;
				}
				left = 0;
				right = data[m].list.size();
				premid = -1;
				for (;;) {
					int mid = (left + right) / 2;

					E cand = data[m].list.get(mid);
					if (premid == mid) {
//						System.err.println("end with " + cand.start + " "
//								+ cand.end + " " + cand.sum);
						ret += cand.sum;
						break;
					}

					if (cand.start > t2) {
						right = mid;
					} else if (cand.end < t2) {
						left = mid;
					} else {
//						System.err.println("end with " + cand.start + " "
//								+ cand.end + " " + cand.sum);
						ret += (cand.sum + t2 - cand.start);
						break;
					}
					premid = mid;
				}
				System.out.println(ret);
			}

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}