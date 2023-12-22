import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// 出力
		for (int i = 1; i <= 9; i++) {
			if (a % i == 0 && a / i >= 1 && a / i <= 9) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

}
