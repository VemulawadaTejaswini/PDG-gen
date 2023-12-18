import java.util.Scanner;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(((double) w) * h / 2.0d + " " + (((x + x == w) && (y + y == h)) ? 1 : 0));
		}
	}
}
