import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();

		if (a >= c || b >= c) {
			System.out.println("No");
		} else {
			long val1 = 4 * a * b;
			long val2 = c - a - b;
			val2 *= val2;
			if (val1 < val2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
