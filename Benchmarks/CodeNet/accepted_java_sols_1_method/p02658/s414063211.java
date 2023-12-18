import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		long v = 1;
		boolean zeroFlg = false;

		long max = (long) Math.pow(10, 18);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (a[i] == 0) {
				zeroFlg = true;
				break;
			}
		}
		if (zeroFlg) {
			v = 0;
		} else {
			for (long a1 : a) {
				if (max / v >= a1) {
					v *= a1;
				} else {
					v = -1;
					break;
				}
			}
		}
		System.out.println(v);
	}
}