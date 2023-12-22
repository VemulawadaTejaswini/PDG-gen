import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 文字列の入力
		while (true) {
			// String型で入力
			String strInput = scanner.nextLine();

			// "0"で終了
			if (("0").equals(strInput)) {
				break;
			}

			int intSum = 0;
			// 桁数分ループ処理
			for (int intLength = 0; intLength < strInput.length(); intLength++ ) {
				// 型変換を行って１文字ずつ合計値に加算
				char charNum = strInput.charAt(intLength);
				String strNum = String.valueOf(charNum);
				int intNum = Integer.parseInt(strNum);
				intSum += intNum;
			}
			System.out.println(intSum);
		}

	}

}

