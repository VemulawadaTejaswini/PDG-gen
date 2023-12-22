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

		int[] b = new int[n];
		System.arraycopy(a, 0, b, 0, n);
		Arrays.parallelSort(b);

		if (b[n - 1] == b[n - 2]) {
			for (int i = 0; i < n; i++) {
				System.out.println(b[n - 1]);
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (a[i] == b[n - 1]) {
					System.out.println(b[n - 2]);
				} else {
					System.out.println(b[n - 1]);
				}
			}
		}
	}
}
