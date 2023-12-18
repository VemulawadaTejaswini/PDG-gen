import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n, m, w, h, S;
	static int l[], r[];
	static int a[];

	public static int check(int aid, int low, int high, double x, double y) {
		if (high - low == 1) {
			return low;
		}

		int mid = (low + high) / 2;
		double v1x = -w;
		double v1y = l[mid] - r[mid];
		double v2x = x - w;
		double v2y = y - r[mid];
		double cross = v1x * v2y - v1y * v2x;

		if (0 < cross) {
			return check(aid, low, mid, x, y);
		} else {
			return check(aid, mid, high, x, y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low;
		int high;
		int max;
		int amdh, amdl;
		int amd;

		l = new int[30005];
		r = new int[30005];
		a = new int[30005];

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();
			S = sc.nextInt();
			if ((n | m | w | h | S) == 0) {
				break;
			}
			
			Arrays.fill(a, 0);

			l[0] = r[0] = 0;
			for (int i = 0; i < m ;i++) {
				l[i + 1] = sc.nextInt();
				r[i + 1] = sc.nextInt();
			}
			for (int i = 0; i < n ;i++) {
				a[check(i, 0, m + 1, sc.nextDouble(), sc.nextDouble())]++;
			}
			for (int i = 1; i < m; i++) {
				a[i] = a[i - 1] + a[i];
			}

			low = 0;
			high = 0;
			max = 0;
			while (low <= m && high <= m) {
				if ((l[high] - l[low] + r[high] - r[low]) * w / 2 <= w * h - S) {
					amdh = 0;
					amdl = 0;
					if (0 < high) {
						amdh = a[high - 1];
					}
					if (0 < low) {
						amdl = a[low - 1];
					}
					amd = amdh - amdl;
					max = Math.max(max,  amd);
					high++;
				} else {
					low++;
				}
			}
			System.out.println(n - max);
		}
	}
}