import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (int c = 0;; c++) {

			int n = sc.nextInt();
			int t = sc.nextInt();
			if (n + t == 0) {
				break;
			}
			int m[] = new int[n];
			int l[] = new int[n];
			int k[] = new int[n];

			for (int i = 0; i < n; i++) {
				m[i] = sc.nextInt();
				l[i] = sc.nextInt();
				k[i] = sc.nextInt();
			}

			int max = n;
			int min = 1;
			for (int z = 0; z <= n; z++) {
				if (max == min) {
					break;
				}
				int med = (max + min) / 2;
				med = z;

				int f = 0;
				int m2[] = new int[n];
				int st[] = new int[n]; // l,m , k
				int ope = med;

				for (int i = 0; i < n; i++) {
					m2[i] = l[i];
				}
				PriorityQueue<Integer> q = new PriorityQueue<Integer>();

				for (int a = 0;;) {

					if (f == n) {
						// System.out.println(med + " ok");
						max = med;
						min = z;
						break;
					}
					if (a >= t + 1) {
						// System.out.println(med + " xx");
						min = med + 1;
						break;
					}
					/*
					 * for (int i = 0; i < n; i++) { if (st[i] == 2) { if (m2[i]
					 * == 0) { st[i] = 0; m2[i] = l[i]; } } }
					 */
					for (int i = 0; i < n; i++) {
						if (st[i] == 1) {
							if (m2[i] <= a) {
								f++;
								st[i] = 3;
								ope++;
							}
						}
					}
					int mini2 = t + 1;
					int mini = t + 1;
					for (int i = 0; i < n; i++) {
						if (st[i] == 0) {
							int za = a % (l[i] + k[i]);
							if (za <= l[i]) {
								if (ope > 0) {
									ope--;
									st[i] = 1;
									m2[i] = m[i] + a;
									q.add(m2[i]);
									// mini = Math.min(mini, m2[i]);
								}
							} else {
								m2[i] = za + a;
								mini2 = Math.min(mini2, m2[i]);
							}
						}
					}

					if (q.isEmpty()) {
						mini = mini2;
					} else {
						if (ope > 0 && mini2 < q.peek()) {
							mini = mini2;
						} else {
							mini = q.poll();
						}
					}
					a = mini;

				}
			}

			System.out.println(max);

		}

	}

	public static void main(String[] args) {
		new Main().run();

	}

}