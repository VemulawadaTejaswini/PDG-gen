import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int[] b = new int[n + 1];
		do {
			for (int i = 1; i <= n; i++) {
				int min = (i - a[i]) < 1 ? 1 : (i - a[i]);
				int max = (i + a[i]) > n ? n : (i + a[i]);
				for (int j = min; j <= max; j++) {
					b[j]++;
				}
			}
			System.arraycopy(b, 0, a, 0, b.length);
			b = new int[n + 1];
		} while (--k != 0);

		for (int i = 1; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n]);
	}
}
