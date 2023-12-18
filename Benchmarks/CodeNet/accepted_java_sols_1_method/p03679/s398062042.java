import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int c = b - a;
		if (c <= 0) {
			System.out.println("delicious");
		} else if (c <= x) {
			System.out.println("safe");
		} else {
			System.out.println("dangerous");
		}
	}

}