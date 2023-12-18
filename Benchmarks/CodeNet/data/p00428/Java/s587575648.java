import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int n, m;
		int location[] = new int[100];
		n = scanner.nextInt();
		m = scanner.nextInt();

		while (n + m != 0) {
			for (int i = 0; i < m; i++) {
				location[i] = 0;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					location[j] += scanner.nextInt();
				}
			}
			int n2 = n;
			while (0 <= n2) {
				for (int i = 0; i < m; i++) {
					if (location[i] == n2) {
						if (n == n2) {
							System.out.print((i + 1));
						} else {
							System.out.print(" " + (i + 1));
						}
					}
				}
				n2--;
			}
			System.out.println();
			n = scanner.nextInt();
			m = scanner.nextInt();
		}
	}
}