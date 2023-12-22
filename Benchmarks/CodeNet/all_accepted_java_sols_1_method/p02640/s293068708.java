import java.util.Scanner;

public class Main {

	static final int CRANE = 2;
	static final int TURTLE = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if (CRANE * x == y || TURTLE * x == y) {
			System.out.println("Yes");
			return;
		}

		int crane_num = 4 * x - y;
		if (crane_num < 0 || crane_num % 2 != 0) {
			System.out.println("No");
			return;
		}
		crane_num /= 2;
		if (x - crane_num < 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}
}
