import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		if (k % 2 == 1) {
			long wa =0;
			for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					wa++;
				}}
			System.out.println(wa * wa * wa);

		} else {
			long wa = 0;
			long wa2 = 0;
			for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					wa++;
				}
				if ((i % k) == (k / 2)) {
					wa2++;
				}
			}

			System.out.println((wa * wa * wa) + (wa2 * wa2 * wa2));

		}

	}
}