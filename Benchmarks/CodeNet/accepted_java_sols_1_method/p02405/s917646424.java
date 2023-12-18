
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

			//どちらも0の時は終了
			if (H == 0 && W == 0) {
				break;

			}
			//繰り返しH(縦)
			for (int i = 0; i < H; i++) {

				//繰り返しW(横)
				for (int j = 0; j < W; j++) {

					if (i % 2 == 0) { //奇数行
						if (j % 2 == 0) {//奇数列
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					} else { //偶数行
						if (j % 2 == 0) {//奇数列
							System.out.print(".");
						} else {
							System.out.print("#");//偶数列
						}
					}
				}
				System.out.println();//縦を次の行に
			}
			System.out.println();//最後の改行
		}

	}

}
