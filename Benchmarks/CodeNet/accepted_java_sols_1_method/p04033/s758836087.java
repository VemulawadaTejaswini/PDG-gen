import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (a > 0) {
			System.out.println("Positive");
		} else if (a <= 0 && 0 <= b) {
			System.out.println("Zero");
		} else {
			if ((b - a + 1) % 2 == 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}
		in.close();
	}
}