import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			int t = scanner.nextInt();
			System.out.println((x > t) ? (x - t) : 0);
		}
	}
}
