import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n];
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int tmin[] = new int[n];
		int tmax[] = new int[n];
		int amin[] = new int[n];
		int amax[] = new int[n];
		tmin[0] = tmax[0] = t[0];
		for (int i = 1; i < n; i++) {
			if (t[i] == t[i - 1]) {
				tmin[i] = 1;
				tmax[i] = t[i];
			} else {
				tmin[i] = t[i];
				tmax[i] = t[i];
			}
		}
		amin[n - 1] = amax[n - 1] = a[n - 1];
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				amin[i] = 1;
				amax[i] = a[i];
			} else {
				amin[i] = a[i];
				amax[i] = a[i];
			}
		}

		long r = 1;
		for (int i = 0; i < n; i++) {
			int rr = Math.min(tmax[i], amax[i]) - Math.max(tmin[i], amin[i]) + 1;
			if (rr < 1) {
				r = 0;
				break;
			}
			r = r * rr % 1000000007;
		}

		System.out.println(r);
	}
}
