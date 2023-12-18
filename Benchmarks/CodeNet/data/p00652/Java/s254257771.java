import java.util.Scanner;

public class Main {
	static int n, m, w, h, S;
	static double l[], r[];
	static double x[], y[];
	static int a[];

	public static int check(int aid, int low, int high) {
		if (high - low == 1) {
			return low;
		}

		int mid = (low + high) / 2;
		double v1x = -w;
		double v1y = l[mid] - r[mid];
		double v2x = x[aid] - w;
		double v2y = y[aid] - r[mid];
		double cross = v1x * v2y - v1y * v2x;

		if (0 < cross) {
			return check(aid, low, mid);
		} else {
			return check(aid, mid, high);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();
			S = sc.nextInt();
			if ((n | m | w | h | S) == 0) {
				break;
			}
			l = new double[m + 1];
			r = new double[m + 1];
			x = new double[n];
			y = new double[n];
			a = new int[m];
			
			l[0] = r[0] = 0;
			for (int i = 0; i < m ;i++) {
				l[i + 1] = sc.nextDouble();
				r[i + 1] = sc.nextDouble();
			}
			for (int i = 0; i < n ;i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				a[check(i, 0, m + 1)]++;
			}
			for (int i = 1; i < m; i++) {
				a[i] = a[i - 1] + a[i];
			}
			
			int low = 0;
			int high = 0;
			int max = 0;
			while (low <= m && high <= m) {
				if ((l[high] - l[low] + r[high] - r[low]) * w / 2 <= w * h - S) {
					int amdh = 0;
					int amdl = 0;
					if (0 < high) {
						amdh = a[high - 1];
					}
					if (0 < low) {
						amdl = a[low - 1];
					}
					int amd = amdh - amdl;
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