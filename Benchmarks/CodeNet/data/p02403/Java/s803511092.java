import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = "#";
		while (true) {
			// 1 ≤ H ≤ 300
			Integer h = sc.nextInt();
			// 1 ≤ W ≤ 300
			Integer w = sc.nextInt();

			// H, W がともに 0 のとき、入力の終わり
			if (h == 0 && w == 0) {
				return;
			}

			for (Integer i = 0; i < h; i++) {
				for (Integer j = 0; j < w; j++) {

					System.out.print(a);

				}
				System.out.println();
			}
			System.out.println();

		}

	}
}
