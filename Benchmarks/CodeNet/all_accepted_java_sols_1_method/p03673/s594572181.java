import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			if (n == 1) {
				System.out.println(a[0]);
			} else {
				// 偶数
				System.out.print(a[n - 1]);
				for (int i = n - 3; 0 <= i; i -= 2) {
					System.out.print(" ");
					System.out.print(a[i]);
				}
				if (n % 2 == 0) {
					for (int i = 0; i < n; i += 2) {
						System.out.print(" ");
						System.out.print(a[i]);
					}
				} else {
					for (int i = 1; i < n; i += 2) {
						System.out.print(" ");
						System.out.print(a[i]);
					}
				}
				System.out.println();
			}
		}
	}
}