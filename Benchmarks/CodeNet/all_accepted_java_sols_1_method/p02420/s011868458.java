import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			// 入力した文字列を格納
			String charStr = scan.nextLine();

			// ループ終了条件
			if (charStr.equals("-")) {
				break;
			}
			// アルファベットを格納するリストを作成
			List<Character> alpha = new ArrayList<>();

			// 入力された文字列をリストに格納する
			for (int i = 0; i < charStr.length(); i++) {
				alpha.add(charStr.charAt(i));
			}
			// 入力したシャッフル回数を格納
			int shuffle = scan.nextInt();

			for (int i = 0; i < shuffle; i++) {
				// 上に持っていく枚数を格納
				int choiceNum = scan.nextInt();
				// 先頭のアルファベットを新たに追加して、削除するループ
				for (int addI = 0; addI < choiceNum; addI++) {
					// 先頭のアルファベットを追加
					alpha.add(alpha.get(0));
					// 先頭のアルファベットを削除
					alpha.remove(0);
				}
			}
			// 並び替えたアルファベットを出力
			for (int i = 0; i < charStr.length(); i++) {
				System.out.print(alpha.get(i));
			}
			System.out.println("");
			charStr = scan.nextLine();
		}
		scan.close();
	}
}

