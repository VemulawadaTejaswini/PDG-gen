import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), p = scanner.nextInt();
			System.out.println((a * 3 + p) / 2);
		}
	}
}
