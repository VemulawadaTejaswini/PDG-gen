import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();

		long diff = c - (a + b);
		if (diff <= 0) {
			// 負の場合はNG
			System.out.println("No");
			return;
		}

		long left = 4 * a * b;
		if (left < diff * diff) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
