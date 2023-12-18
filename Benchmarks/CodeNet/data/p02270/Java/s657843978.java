import java.util.Scanner;

public class Main {

	static int[] w;
	static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];

		for (int i=0; i<n; i++) {
			w[i] = sc.nextInt();
		}

		long left = 0;
		long right = 100000 * 10000;
		while (right-left>1) {
			long mid = (left+right)/2;
			if (can(mid)) {
				right = mid;
			} else {
				left = mid;
			}
		}

		System.out.println(right);

		sc.close();
	}

	static boolean can(long v) {
		int j=0;
		for (int i=0; i<k; i++) {
			long sum = 0;
			while (j<w.length && sum+w[j]<=v) {
				sum += w[j];
				j++;
			}
		}
		if (j==w.length) {
			return true;
		}
		return false;
	}
}