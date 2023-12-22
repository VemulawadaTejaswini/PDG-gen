import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();

		if (x % 2 == 1) {
			System.out.println((x - 1) / 2);
		} else {
			System.out.println(x / 2 - 1);
		}
	}
}
