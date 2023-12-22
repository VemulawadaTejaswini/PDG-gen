import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int s = scanner.nextInt(), w = scanner.nextInt();
			System.out.println((s > w) ? "safe" : "unsafe");
		}
	}
}
