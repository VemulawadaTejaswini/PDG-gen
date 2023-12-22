import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		int count = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = n - 1; i > 0; i--) {
				if (a[i] < a[i - 1]) {
					int tmp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = tmp;
					count++;
					flag = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		System.out.println(count);
	}
}