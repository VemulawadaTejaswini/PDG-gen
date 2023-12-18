import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//hとwを入力
		Scanner sc = new Scanner (System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		//四角形を描写
		while ((h != 0) || (w != 0)) {

			//hとw共に0の時終了
			if ((h == 0) && (w == 0)) {
				break;
			} else {

				//高さh・幅wの四角形を描写
				for (int x = 0; x < h; x++) {
					for (int y = 0; y < w; y++) {
						
						//柄の切り替え
						if ((x + y) % 2 == 0) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
						
					}

					//改行?
					System.out.println();
				}

				//改行?
				System.out.println();

				//hとwを入力
				h = sc.nextInt();
				w = sc.nextInt();
			}
		}
		
	}

}