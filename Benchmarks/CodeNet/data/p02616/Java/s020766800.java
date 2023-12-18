import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int m = 0;
		int z = 0;
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				z++;
			} else if (a[i] > 0) {
				p++;
			} else {
				m++;
			}
		}

		boolean bz = false;
		boolean bp = false;
		if (z > 0) {
			bz = true;
		}
		if (p + m == k) {
			if (k % 2 == m % 2) {
				bp = true;
			}
		} else if (p + m > k) {
			if (p > 0 || k % 2 == 0) {
				bp = true;
			}
		}

		int mod = 1000000007;
		long mod1 = (long) mod * mod;
		if (bp) {
			PriorityQueue<Integer> qp = new PriorityQueue<>((o1, o2) -> o2 - o1);
			PriorityQueue<Integer> qm = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					qp.add(a[i]);
				} else {
					qm.add(a[i]);
				}
			}

			boolean now = true;
			long ans = 1;
			for (int i = 0; i < k; i++) {
				if (i == k - 1) {
					if (now) {
						ans *= qp.poll();
					} else {
						ans *= qm.poll();
					}
				} else {
					if (!now && qp.size() == 1 && (k - i) % 2 == 1) {
						ans *= qm.poll();
						now = !now;
					} else if (now && qm.size() == 1) {
						ans *= qp.poll();
					} else {
						Integer np = qp.peek();
						Integer nm = qm.peek();
						if (nm == null || np != null && np > -nm) {
							ans *= qp.poll();
						} else {
							ans *= qm.poll();
							now = !now;
						}
					}
				}
				if (ans < 0) {
					ans += mod1;
				}
				ans %= mod;
			}
			System.out.println(ans);

		} else if (bz) {
			System.out.println(0);

		} else {
			PriorityQueue<Integer> qp = new PriorityQueue<>();
			PriorityQueue<Integer> qm = new PriorityQueue<>((o1, o2) -> o2 - o1);
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					qp.add(a[i]);
				} else {
					qm.add(a[i]);
				}
			}
			long ans = 1;
			for (int i = 0; i < k; i++) {
				Integer np = qp.peek();
				Integer nm = qm.peek();
				if (nm == null || np != null && np < -nm) {
					ans *= qp.poll();
				} else {
					ans *= qm.poll();
				}
				if (ans < 0) {
					ans += mod1;
				}
				ans %= mod;
			}
			System.out.println(ans);
		}
	}
}
