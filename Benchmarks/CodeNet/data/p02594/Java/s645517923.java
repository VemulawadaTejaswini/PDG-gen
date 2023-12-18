import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int ondo = Integer.parseInt(data);

			System.out.println(ondo >= 30 ? "Yes" : "No");
		}
	}
}
