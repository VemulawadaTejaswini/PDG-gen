import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int num = scan.nextInt();

			if (num % 2 == 0 && !(num % 3 == 0 || num % 5 == 0)) {
				System.out.println("DENIED");
				return;
			}
		}

		System.out.println("APPROVED");
 	}
}