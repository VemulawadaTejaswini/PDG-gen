import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int max = 0, total = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i ++) {
			a[i] = sc.nextInt();
			total += a[i];
		}
		int c = 0;
		for (int z : a) {
			if (z * 4 * m >= total ) {
				c++;
			}
		}

		if (c >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
