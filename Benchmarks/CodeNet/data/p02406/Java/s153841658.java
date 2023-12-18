import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int n = sc.nextInt();
		for (int k = 1; k <= n; k++) {

			if (k % 3 == 0 || k % 10 == 3) {
				System.out.printf(" %d", k);
			}

		}
	}
}