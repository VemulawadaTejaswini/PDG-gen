

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if ((a + b) % 2 == 0) {
				int answer = (a + b) / 2;
				System.out.println(answer);
			}else{
				System.out.println("IMPOSSIBLE");
			}
			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}

}

