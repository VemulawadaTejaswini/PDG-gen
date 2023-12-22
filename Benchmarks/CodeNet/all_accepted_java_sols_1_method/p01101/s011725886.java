import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			if(n == 0 && m == 0) {
				break;
			}

			int a[] = new int[n];

			int ans = -1;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (ans < a[i] + a[j] && a[i] + a[j] <= m) {
						ans = a[i] + a[j];
					}
				}
			}

			if (ans == -1) {
				System.out.println("NONE");
			} else {
				System.out.println(ans);
			}

		}

		sc.close();

	}

}
