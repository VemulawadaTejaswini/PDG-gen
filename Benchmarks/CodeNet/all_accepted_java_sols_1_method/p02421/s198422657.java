import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int intCount = scanner.nextInt();

		int intTaro = 0;
		int intHanako = 0;
		for (int intI = 0; intI < intCount; intI++) {
			// 文字列入力
			String strTaroCard = scanner.next();
			String strHanakoCard = scanner.next();

			// intCount分forループ処理、文字列比較
			if (strTaroCard.compareTo(strHanakoCard) < 0) {
				intHanako += 3;
			} else if (strTaroCard.compareTo(strHanakoCard) > 0) {
				intTaro += 3;
			} else if (strTaroCard.compareTo(strHanakoCard) == 0) {
				intTaro += 1;
				intHanako += 1;
			}
		}
		System.out.println(intTaro + " " + intHanako);
	}

}

