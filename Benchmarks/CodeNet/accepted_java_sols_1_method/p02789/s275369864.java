import java.util.Scanner;

public class Main {
	/**
	 * AC or WA
	 * @param 1 ≤ N ≤ 100
	 * @param 0 ≤ M ≤ N
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == m) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}