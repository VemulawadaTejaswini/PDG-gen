import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String type = scanner.nextLine();
			if (type.equals("#")) {
				break;
			}

			int now = 0;// 今いる場所左が-1で右が1で最初は0
			int sum = 0;// 移動回数の合計
			for (int i = 0; i < type.length(); i++) {
				String letter = type.substring(i, i + 1);// 1文字ずつ取り出す
				int position = 0;// 文字が属す側
				if ("qwertasdfgzxcvb".indexOf(letter) != -1) {
					// 取り出した文字が左側に属する時
					position = -1;
				} else {
					// 取り出した文字が右側に属する時
					position = 1;
				}
				if (now != position) {
					now = position;
					sum++;
				}
			}
			System.out.println(sum - 1);// 最初のタイプも移動と見なしているので1回多い

		}

	}

}