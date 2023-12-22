import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String S = input.nextLine();
		String T = input.nextLine();
		String[] SList = S.split("");

		String tmpS = "";
		boolean flag = false;
		for (int i = 0; i < SList.length; i++) {
			// 文字を末尾を除外して連結
			for (int j = 0; j < SList.length - 1; j++) {
				tmpS += SList[j];
			}
			// 末尾を先頭に移動
			tmpS = SList[SList.length - 1] + tmpS;

			if (tmpS.equals(T)) {
				System.out.println("Yes");
				flag = true;
				break;
			} else {
				// 一致しなかった場合、配列に入れ替えたデータを設定
				SList = tmpS.split("");
				tmpS = "";
			}
		}
		if (!flag) {
			System.out.println("No");
		}
		input.close();
	}
}
