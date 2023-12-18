

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// テキスト入力
		Scanner sc = new Scanner(System.in);
		ArrayList<StringBuilder> one_obj = new ArrayList<StringBuilder>();
		String one_word = "";

		//
		while (true) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if (height == 0 && width == 0) {
				break;
			}

			// 高さ分ループする
			for (int h = 0; h < height; h++) {

				// 幅分ループ
				for (int w = 0; w < width; w++) {

					// 奇数列
					if (h % 2 == 0) {
						// 奇数個目は#
						if (w % 2 == 0) {
							one_word += "#";
						} else {// 偶数個目は.
							one_word += ".";
						}

						// 偶数列
					} else {
						// 奇数個目は.
						if (w % 2 == 0) {
							one_word += ".";
						} else {// 偶数個目は#
							one_word += "#";
						}
					}
				}
				// 一列が終わったので改行を追加
				one_word += "\n";
			}
			
			StringBuilder strBul_one_word = new StringBuilder(one_word);

			one_obj.add(strBul_one_word);
			one_word = "";

		}
		for (int index = 0; index < one_obj.size(); index++) {
			System.out.println(one_obj.get(index));
		}
	}

}