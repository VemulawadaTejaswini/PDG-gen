import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int n = Integer.parseInt(data);

			int ans = (10000 - n) % 1000;

			System.out.println(ans);
		}
	}
}