import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int a[];
		int count;

		n = scanner.nextInt();
		while (n != 0) {
			a = new int[n];
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n ; i++) {
				if ((i + 1) % 2 == 0) {
					for (int j = i - 1; 0 <= j; j--) {
						if (a[j] == a[i]) {
							break;
						} else {
							a[j] = a[i];
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
			n = scanner.nextInt();
		}
	}
}