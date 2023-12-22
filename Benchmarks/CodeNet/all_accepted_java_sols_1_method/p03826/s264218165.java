import java.util.Scanner;

public class Main {

	/**
	 * Two Rectangles
	 * @param 1 ≦ A ≦ 10^4
	 * @param 1 ≦ B ≦ 10^4
	 * @param 1 ≦ C ≦ 10^4
	 * @param 1 ≦ D ≦ 10^4
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (a * b >= c * d) {
				System.out.println(a * b);
			} else {
				System.out.println(c * d);
			}
		}
	}
}
