import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(input);

		if (n >= 3 && n <= 10000) {
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0) {
					System.out.print(" " + i);
				}

			}

		}

	}

}

