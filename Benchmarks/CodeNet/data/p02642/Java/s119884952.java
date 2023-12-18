import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int div = 0;
		int sum = 0;
		boolean flg = false;

		for (int i = 0; i < n; i++) {
			flg = false;
			div = a[i];
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				if ((div % a[j]) == 0) {
					flg = true;
					break;
				}
			}
			if (!flg) {
				sum++;
			}
		}

		System.out.println(sum);

		scan.close();

	}

}
