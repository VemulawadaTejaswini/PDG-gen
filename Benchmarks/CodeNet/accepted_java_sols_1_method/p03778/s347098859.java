import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int W = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			// 連結
			if ((a <= b && (a + W) >= b) || (a <= (b + W) && (a + W) >= (b + W))) {
				System.out.println(0);

				// b が大きい
			} else if ((a + W) < b) {
				System.out.println(b - (a + W));

				// a が大きい
			} else if (a > (b + W)) {
				System.out.println(a - (b + W));
			}

		}
	}
}