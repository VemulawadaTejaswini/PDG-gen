import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);

		int[] sum = new int[m];
		for (int i = 1; i < m; i++) {
			if (i <= 2) {
				sum[i] = p[i] - p[i - 1];
			} else {
				sum[i] = sum[i - 2] + p[i] - p[i - 1];
			}
		}

		long res = 0;
		for (int i = 0; i < n; i++) {
			boolean swapped = s[i] > t[i];
			if (s[i] > t[i]) {
				int d = s[i];
				s[i] = t[i];
				t[i] = d;
			}
			int a = lower_bound(p, s[i]);// s[i]????????§??????????°??????????
			int b = lower_bound(p, t[i]) - 1;// t[i]???????°????????????§?????????

			// ?¬????????????¨?????????
			if (a > b) {
				res += t[i] - s[i];
			} else {
				if ((a - b) % 2 == 0) {
					if (!swapped) {
						res += sum[b] - sum[a] + Math.abs(p[a] - s[i]);
					} else {
						res += (t[i] - p[a]) - (sum[b] - sum[a]);
					}
				} else {
					res += Math.abs(sum[a] - sum[b - 1]) + Math.abs(p[a] - s[i]) + Math.abs(t[i] - p[b]);
				}
			}
		}
		System.out.println(res);
	}

	// a????????§key??\?????????????°?????????´???????????????
	static int lower_bound(int[] a, int key) {
		int lo = -1;
		int hi = a.length;
		while (hi - lo > 1) {
			int mid = (lo + hi) / 2;
			if (a[mid] < key) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		return hi;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}