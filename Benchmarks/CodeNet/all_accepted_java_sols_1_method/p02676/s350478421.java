import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			int K = scanner.nextInt();
			String S = scanner.next();

			if (S.length() <=K)  {
				System.out.print(S);
			} else {
				System.out.print(S.substring(0, K) + "...");
			}

		}
	}
}