
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			int h = scanner.nextInt();
			if (x == 0 && h == 0) {
				break;
			}
			System.out.println(x * Math.sqrt(4 * h * h + x * x) + x * x);
		}
	}
}