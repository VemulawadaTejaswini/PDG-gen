import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int startIndex;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			startIndex = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (i != 0 && i - startIndex != a[i] - a[startIndex]) {
					if (i - startIndex != 1) {
						System.out.print(a[startIndex] + "-" + a[i - 1] + " ");
					} else {
						System.out.print(a[startIndex] + " ");
					}
					startIndex = i;
				}
				if (i == n - 1) {
					if (i - startIndex != 0) {
						System.out.print(a[startIndex] + "-" + a[i]);
					} else {
						System.out.print(a[startIndex]);
					}
				}
			}
			System.out.println();
			n = sc.nextInt();
		}
	}
}