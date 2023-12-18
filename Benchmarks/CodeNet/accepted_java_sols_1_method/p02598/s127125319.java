import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int l = 0;
			int r = 1_000_000_000;
			while (l < r - 1) {
				int mid = (l + r) / 2;

				int cutCount = 0;
				for (int i = 0; i < n; i++) {
					cutCount += (a[i] - 1) / mid;
				}

				if (cutCount <= k) {
					r = mid;
				} else {
					l = mid;
				}
			}

			System.out.println(r);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}