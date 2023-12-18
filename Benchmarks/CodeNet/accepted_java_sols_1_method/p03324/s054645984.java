import java.util.Scanner;

public class Main {

	/** 100 */
	private static final int HUNDRED = 100;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int d = scanner.nextInt(), n = scanner.nextInt();
			int pow = 1;
			for (int i = 0; i < d; i++) {
				pow *= HUNDRED;
			}
			System.out.println(((HUNDRED == n) ? (n + 1) : n) * pow);
		}
	}
}
