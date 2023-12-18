import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long k = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		long time = 0L;
		int markA = 0, markB = 0, count = 0;
		while (time < k) {
			if (markA < n && markB < m) {
				if (a[markA] < b[markB]) {
					if (time + a[markA] <= k) {
						time += a[markA];
						markA++;
						count++;
					} else {
						break;
					}
				} else {
					if (time + b[markB] <= k) {
						time += b[markB];
						markB++;
						count++;
					} else {
						break;
					}
				}
			} else if (markA < n) {
				if (time + a[markA] <= k) {
					time += a[markA];
					markA++;
					count++;
				} else {
					break;
				}
			} else if (markB < m) {
				if (time + b[markB] <= k) {
					time += b[markB];
					markB++;
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}