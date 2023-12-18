import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//hとwの値を入力
		Scanner sc = new Scanner (System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		//四角形を描画
		while (true) {

			//hとw共に０だった場合終了
			if ((h == 0) && (w == 0)) {
				break;
			} else {

				//高さh・幅wの四角形を描画
				for (int x = 0; x < h; x++) {
					for (int y = 0; y < w; y++) {
						System.out.print("#");
					}
					System.out.println();
				}
				System.out.println();
			}

			//hとwの値を入力
			h = sc.nextInt();
			w = sc.nextInt();
		}

	}

}