import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String n = scanner.next();
			int N = Integer.parseInt(n.substring(1));

			if (N == 2 || N == 4 || N == 5 || N == 7 || N == 9) {
				System.out.print("hon");
			}else if (N == 0 || N == 1 || N == 6 || N == 8) {
				System.out.print("pon");
			} else {
				System.out.print("bon");
			}

		}
	}
}