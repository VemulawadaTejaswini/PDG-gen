import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int k = scanner.nextInt();
			int a = scanner.nextInt(), b = scanner.nextInt();
			System.out.println(((0 == (a % k)) || ((a / k) != (b / k))) ? "OK" : "NG");
		}
	}
}
