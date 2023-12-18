import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);
		reverse(a);

		long ans = a[0];
		int n2 = n / 2;
		for (int i = 1; i < n2; i++) {
			ans += a[i] * 2;
		}
		if (n % 2 == 1) {
			ans += a[n2];
		}
		System.out.println(ans);
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int tmp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = tmp;
		}
	}
}
