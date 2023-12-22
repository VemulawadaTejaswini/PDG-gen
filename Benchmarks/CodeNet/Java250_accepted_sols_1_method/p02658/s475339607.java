import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		boolean isZero = false;
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			if (tmp == 0) {
				isZero = true;
				break;
			}
			a[i] = tmp;

		}
		sc.close();
		long ans = 1;
		long max = (long) Math.pow(10, 9);
		int count = 0;
		boolean isLarge = false;
		Arrays.sort(a);
		for (int i = n - 1; i >= 0; i--) {
			ans *= a[i];
			if (a[i] > max) {
				count++;
			}
			if (count == 2 || ans > max * max) {
				isLarge = true;
				break;
			}
		}
		if (isZero) {
			System.out.println(0);
		} else if (isLarge) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}