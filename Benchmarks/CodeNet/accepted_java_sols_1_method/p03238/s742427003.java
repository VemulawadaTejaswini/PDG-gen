import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String age = scanner.nextLine();

		switch (age) {
		case "1":
			System.out.println("Hello World");
			break;
		case "2":
			int a = Integer.parseInt(scanner.nextLine());
			int b = Integer.parseInt(scanner.nextLine());
			System.out.println(a + b);
			break;
		default:
			break;
		}
	}
}