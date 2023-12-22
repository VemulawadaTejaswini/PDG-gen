import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputc1 = scanner.nextLine();
		String inputc2 = scanner.nextLine();
		String inputc3 = scanner.nextLine();
		scanner.close();

		System.out.println(inputc1.substring(0, 1) + inputc2.substring(1, 2) + inputc3.substring(2));

	}
}
