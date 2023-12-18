import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//入力
		Scanner sc = new Scanner(System.in);

		//図形作成繰り返し
		for (int h = 0;; h++) {

			//縦の長さ
			int H = sc.nextInt();

			//横の長さ
			int W = sc.nextInt();

		//	if (H > 0 && W > 0) {

				//どちらも0の時は終了
				if (H == 0 && W == 0) {
					break;

				}
				//繰り返しH
				for (int i = 0; i < H; i++) {

					//	System.out.println("#");

					//繰り返しW
					for (int j = 0; j < W; j++) {

						System.out.print("#");

					}
					System.out.println();
				}
			//}
			System.out.println();
		}

	}
}

