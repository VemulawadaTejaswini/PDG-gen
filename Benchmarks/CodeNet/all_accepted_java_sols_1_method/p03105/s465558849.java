import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		try {
			Scanner scanner = new Scanner(System.in);

			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = scanner.nextInt();

			int answer = B / A;

			if (C < answer)
				answer = C;

			System.out.println(answer);
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}
	}
}
