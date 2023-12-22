
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			/* 読み込み */
			int H = sc.nextInt();
			int W = sc.nextInt();
			/* HWが0のとき入力終了 */
			if (H == 0 && W == 00) {
				break;
			}
			if (H < 3 || H > 300 || W < 3 || W > 300) {
				System.out.println("数値の有効範囲は3<=H, W<=300です");
				continue outer;
			}
			/* 1行目出力 */
			for (int i = 0; i < W; i++) {
				System.out.print("#");
			}
			// 改行
			System.out.println();
			/* 中間行出力 */
			for (int i = 1; i < H - 1; i++) {
				/* 最初の文字を出力 */
				System.out.print("#");
				/* 間の文字を出力 */
				for (int j = 1; j < W - 1; j++) {
					System.out.print(".");
				}
				/* 最後の文字を出力 */
				System.out.println("#");
			}
			/* 最後の行を出力 */
			for (int j = 0; j < W; j++) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}

	}
}
