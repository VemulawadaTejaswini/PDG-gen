import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next()) - i - 1;
		}

		Arrays.sort(a);
		long ans = 0;
		int p = 0;

		if (n % 2 == 0) {
			p = (a[n / 2 - 1] + a[n / 2]) / 2;
		} else {
			p = a[n / 2];
		}

		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - p);
//			System.out.println(a[i] + " " + p + " " + ans);
		}

		System.out.println(ans);
		sc.close();
	}
}