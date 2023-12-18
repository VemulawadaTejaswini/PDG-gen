import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int count = 0;
		double answer = 0.0;

		// 数の入力
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}

		answer = (double) count / (double) num;
		System.out.println(answer);

	}
}
