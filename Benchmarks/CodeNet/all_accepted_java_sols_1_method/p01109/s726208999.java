import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {

			// 人数取得
			int count = scanner.nextInt();
			if (count == 0) {
				break;
			}

			// 合計取得
			int sum = 0;
			int pointArray[] = new int[count];
			for (int i = 0; i < count; i++) {
				int point = scanner.nextInt();
				pointArray[i] = point;

				sum = sum + point;
			}

			// 平均値取得
			int avg = sum / count;

			// 平均値以下取得
			int counter = 0;
			for (int i = 0; i < count; i++) {
				if (avg >= pointArray[i]) {
					counter++;
				}
			}

			System.out.println(counter);
		}

		scanner.close();
	}
}

