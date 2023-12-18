import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int[] a = new int[1000000];
		a[0] = sc.nextInt();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				a[i + 1] = a[i] / 2;
			} else {
				a[i + 1] = 3 * a[i] + 1;
			}

			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					System.out.println(i + 1);
					System.exit(0);
				}
			}

		}

	}
}