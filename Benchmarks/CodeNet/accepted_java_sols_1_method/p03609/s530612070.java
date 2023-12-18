import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int t = scanner.nextInt();

		if ((x - t) <= 0) {
			System.out.println(0);
		} else {
			System.out.println(x - t);
		}

	}
}
