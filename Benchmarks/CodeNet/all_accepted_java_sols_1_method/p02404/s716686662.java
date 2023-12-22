

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// テキスト入力
		Scanner sc = new Scanner(System.in);
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();

		while (true) {

			StringBuilder out = new StringBuilder();
			int height = sc.nextInt();
			int width = sc.nextInt();

			if (height == 0 && width == 0) {
				break;
			}
			// #を出す処理
			// 行の数
			for (int h = 0; h < height; h++) {

				// ########の列
				if (h == 0 || h == height - 1) {
					for (int w = 0; w < width; w++) {
						out = out.append("#");
					}
					// #....#の列
				} else {
					for (int w = 0; w < width; w++) {
						if (w == 0 || w == width - 1) {
							out = out.append("#");
						} else {
							out = out.append(".");
						}
					}

				}
				out = out.append("\n");
			}
			list.add(out);
		}
		for (int index = 0; index < list.size(); index++)
			System.out.println(list.get(index));
	}
}