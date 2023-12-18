import java.util.Scanner;

public class Main {

	static int n;
	static int k;
	static int[] w;
	static long P;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		sc.close();

		P = 100000L * 100000L;

		long left = 0L;
		long right = P;

		while (left < right) {
			long mid = (left + right) / 2;
			if (allocate(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(left);

	}

	private static boolean allocate(long maxCapacity) {
		int index = 0;
		for (int i = 0; i < k; i++) {
			long cap = maxCapacity;
			while (index <= n - 1 && cap - w[index] >= 0) {
				cap -= w[index];
				index++;
			}
		}
		if (index != n) {
			return false;
		} else {
			return true;
		}
	}
}