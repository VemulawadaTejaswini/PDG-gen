import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		int nk = n;
		int mk = m;
		int acn = 0;
		int bcn = 0;
		int i = 0;
		int j = 0;
		for (int x = 0; x < n + m; i++) {
			if (k >= 0) {
				if (nk > 0 && mk > 0) {
					if (a[i] <= b[j]) {
						k -= a[i];
						nk -= 1;
						acn++;
						i += 1;
					} else {
						k -= b[j];
						mk -= 1;
						bcn++;
						j += 1;
					}
				} else if (nk == 0 && mk > 0) {
					k -= b[j];
					mk -= 1;
					bcn++;
					j += 1;
				} else if (nk > 0 && mk == 0) {
					k -= a[i];
					nk -= 1;
					acn++;
					i += 1;
				} else {
					int d = acn + bcn;
					System.out.println(d);
					break;

				}

			} else {
				System.out.println(acn + bcn );
				break;
			}
			sc.close();
		}
	}

}