

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int d = scanner.nextInt();
			long sum = 0;
			int i;

			for (i = d; i <= 600 - d;i += d ) {
				sum += d * i * i;
			}
			System.out.println(sum);

		}
		scanner.close();
	}

}

