import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Shojin
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] A = new long[n];
			long max = 0;
			long min = 0;
			for (int i = 0; i < n; i++) {
				long next = sc.nextLong();
				A[i] = next;
				max = Math.max(next, max);
			}
			while (max - min > 1) {
				long mid = (max + min) / 2;
				long cnt = 0;
				boolean ok = true;
				for (int i = 0; i < n; i++) {
					long div = A[i] / mid;
					if (A[i] % mid == 0) {
						cnt += Math.max(div - 1, 0);
					} else {
						cnt += div;
					}
					if (cnt > k) {
						min = mid;
						ok = false;
						break;
					}
				}
				if (ok) {
					max = mid;
				} else {
					min = mid;
				}
			}
			System.out.println(max);
		}
	}
}