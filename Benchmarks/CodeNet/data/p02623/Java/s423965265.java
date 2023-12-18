import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		int ai = 0;
		int bi = 0;
		while (true) {
			boolean canA = (ai != -1) ? ((k - a[ai]) >= 0) : false;
			boolean canB = (bi != -1) ? ((k - b[bi]) >= 0) : false;

			if (canA && canB) {
				if (a[ai] == b[bi]) {
					// 次が小さい方を取る
					int aNext = a[ai + 1];
					int bNext = b[bi + 1];
					if (aNext < bNext) {
						k -= a[ai++];
					} else {
						k -= b[bi++];
					}
				} else if (a[ai] < b[bi]) {
					k -= a[ai++];
				} else {
					k -= b[bi++];
				}
			} else if (canA) {
				k -= a[ai++];
			} else if (canB) {
				k -= b[bi++];
			} else {
				break;
			}

			count++;

			if (ai == n) {
				ai = -1;
			}
			if (bi == m) {
				bi = -1;
			}
		}
		System.out.println(count);
	}
}
