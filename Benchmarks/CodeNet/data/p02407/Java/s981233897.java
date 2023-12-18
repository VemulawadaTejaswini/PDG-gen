import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - 1) - i; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i > n; i++) {
			if (i != 0) {
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
			}
		}

	}

}