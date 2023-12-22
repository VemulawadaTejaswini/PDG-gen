import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int count = b / a;
			if (count > c) {
				System.out.println(c);
			} else {
				System.out.println(count);
			}
		}
	}
}