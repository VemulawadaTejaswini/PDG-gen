import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static String f[];
	static int w[], s[], nw[], ns[];
	static int a[];
	static int ans[];
	static double min;

	public static void f(int k) {
		if (k == n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[j] == i) {
						nw[i] = w[j];
						ns[i] = s[j];
					}
				}
			}
			int sum = 0;
			for (int i = 1; i < n; i++) {
				sum += nw[i];
			}
			for (int i = 0; i < n - 1; i++) {
				if (ns[i] < sum) {
					return ;
				}
				sum -= nw[i + 1];
			}

			double gc = 0, gm = 0;
			for (int i = 0; i < n; i++) {
				gm += nw[i];
				gc += nw[i] * (i + 1);
			}
			if (gc / gm < min) {
				min = gc / gm;
				for (int i = 0; i < n; i++) {
					ans[i] = a[i];
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (a[i] == -1) {
					a[i] = k;
					f(k + 1);
					a[i] = -1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			f = new String[n];
			w = new int[n];
			s = new int[n];
			nw = new int[n];
			ns = new int[n];
			for (int i = 0; i < n; i++) {
				f[i] = sc.next();
				w[i] = sc.nextInt();
				s[i] = sc.nextInt();
			}
			a = new int[n];
			ans = new int[n];
			min = Double.MAX_VALUE;
			Arrays.fill(a,  -1);
			f(0);
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (ans[j] == i) {
						System.out.println(f[j]);
					}
				}
			}
		}
	}
}