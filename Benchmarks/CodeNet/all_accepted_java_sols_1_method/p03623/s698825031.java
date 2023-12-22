import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		String selection = "A";
		if (Math.abs(a - x) > Math.abs(b - x)) {
			selection = "B";
		}
		System.out.println(selection);
	}

}