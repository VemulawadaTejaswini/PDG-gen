
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		long ans = 1;
		for (int i = a; i <= b; i++) {
			if (i == 0) {
				ans = 0;
				break;
			} else if (i > 0) {
				ans *= 1;
			} else {
				ans *= -1;
			}
		}
		if (ans > 0) {
			System.out.println("Positive");
		} else if (ans == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative");
		}
		in.close();
	}
}