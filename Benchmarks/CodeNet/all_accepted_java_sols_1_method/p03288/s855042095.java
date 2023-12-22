import java.util.Scanner;

public class Main {

	/**
	 * Rated for Me
	 * @param 0 ≤ R ≤ 4208
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int r = sc.nextInt();
			if (r < 1200) {
				System.out.println("ABC");
			} else if (r < 2800) {
				System.out.println("ARC");
			} else {
				System.out.println("AGC");
			}
		}
	}
}