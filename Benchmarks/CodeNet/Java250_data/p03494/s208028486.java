import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Integer[] a = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		boolean b = true;

		while (b) {

			for (int j = 0; j < a.length; j++) {

				if (a[j] % 2 > 0) {
					b = false;
					break;

				} else {

					a[j] = a[j] / 2;
				}
			}

			if (b) {
				// カウントアップ
				count++;
			}
		}

		// 出力
		System.out.println(count);
	}
}