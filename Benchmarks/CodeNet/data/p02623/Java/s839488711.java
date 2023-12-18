

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long conbo = n + m;
		long max = scan.nextInt();
		long[] books = new long[(int) conbo];
		long ans = 0;
		for (int i = 0; i < n + m; i++) {
			books[i] = scan.nextInt();
		}

		//全探索が必要な要素要素（conbo）の２条分のループ(on-off全探索)
		for (long bit = 0; bit < 1 << conbo; bit++) {

			long sum = 0;
			long count = 0;

			//要素分のループ
			for (int i = 0; i < books.length; i++) {

				//その要素が今回onになっているかチェック
				if ((1 & bit >> i) == 1) {

					sum = sum + books[i];
					count++;
				}
			}

			if (sum <= max) {
				if (ans < count) {
					ans = count;
				}
			}

		}

		System.out.println(ans);

	}

}
