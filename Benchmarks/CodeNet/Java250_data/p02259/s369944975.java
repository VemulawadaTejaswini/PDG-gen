import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i + 1; j--) {
				if (num[j] < num[j - 1]) {
					int tmp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = tmp;
					count++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(num[i]);
			if (i != n - 1)
				System.out.print(" ");
		}

		System.out.println();
		System.out.println(count);
		scan.close();
	}

}