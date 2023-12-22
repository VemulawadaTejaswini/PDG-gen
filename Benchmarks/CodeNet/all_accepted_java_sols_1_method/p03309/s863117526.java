import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] x = new int[n];
		long ans = 0, b = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			x[i] = a[i] - (i + 1);
			sum += x[i];
		}
		
		Arrays.sort(x);

		if (n % 2 == 0) {
			if (Math.abs(x[(n / 2) - 1] - (sum / 2)) <= Math.abs(x[n / 2] - (sum / 2))) {
				b = x[(n / 2) - 1];
			} else {
				b = x[n / 2];
			}
		} else {
			b = x[(n / 2)];
		}

		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - (b + (i + 1)));
		}
		System.out.println(ans);

		sc.close();
	}
}
