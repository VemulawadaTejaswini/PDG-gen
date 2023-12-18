import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long x = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long cnt = 0;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] + a[i] <= x) {
			} else {
				if (a[i - 1] <= x) {
					cnt += a[i] - (x - a[i - 1]);
					a[i] = x - a[i - 1];
				} else {
					cnt += a[i] + (a[i - 1] - x);
					a[i] = 0;
					a[i - 1] = a[i - 1] - (x - a[i]);
				}
			}
		}
		System.out.println(cnt);
	}
}
