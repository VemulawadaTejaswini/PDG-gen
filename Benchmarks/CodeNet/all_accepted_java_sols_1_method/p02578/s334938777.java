
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		long count = 0L;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				count += (a[i] - a[i + 1]);
				a[i + 1] = a[i];
			}
		}

		System.out.println(count);

	}
}