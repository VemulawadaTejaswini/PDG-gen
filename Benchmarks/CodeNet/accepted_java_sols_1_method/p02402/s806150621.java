import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 整数nの取得
		int n = scanner.nextInt();

		long min = 1000000;
		long max = -1000000;
		long sum = 0;

		for (int i = 0; i < n; i++) {
			// 整数aの取得
			long a = scanner.nextLong();

			sum += a;

			if (min > a) {
				min = a;
			}

			if (max < a) {
				max = a;
			}

		}

		System.out.println(min + " " + max +  " " + sum);

	}

}

