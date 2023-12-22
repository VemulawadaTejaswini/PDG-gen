import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力受付
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			array[i] = scan.nextInt();
		}

		int result[] = new int[n+1];

		for (int i = 1; i <= n; i++) {
			result[array[i]] = i;

		}

		for (int i = 1; i <= n; i++) {
			if (i != n) {
				System.out.print(result[i] + " ");
			} else {
				System.out.print(result[i]);
			}
		}

	}
}