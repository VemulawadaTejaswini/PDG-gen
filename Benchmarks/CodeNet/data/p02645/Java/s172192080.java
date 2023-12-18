import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String name = scanner.nextLine();

			String nickname = name.substring(0, 3);

			System.out.println(nickname);
		}
	}
}