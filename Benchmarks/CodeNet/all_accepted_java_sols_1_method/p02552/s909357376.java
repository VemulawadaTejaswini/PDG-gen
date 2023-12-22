import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int x = Integer.parseInt(data);

			System.out.println(x == 0 ? "1" : "0");
		}
	}
}
