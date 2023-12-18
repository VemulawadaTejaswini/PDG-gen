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
					System.out.print(a[startIndex] + "-" + a[i - 1] + " ");
					startIndex = i;
				} else if (i == n - 1) {
					System.out.print(a[startIndex] + "-" + a[i] + " ");
				}
			}
			System.out.println();
			n = sc.nextInt();
		}
	}
}