import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int count;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			count = 0;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = n - 1; 0 <= i; i--) {
				if ((i + 1) % 2 == 0) {
					if (a[i] != a[i - 1]) {
						a[i - 1] = a[i];
						if (0 <= i - 2) {
							a[i - 2] = a[i];
						}
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					count++;
				}
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}
}