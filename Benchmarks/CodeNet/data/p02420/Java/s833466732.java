import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 文字列入力
		String strLine = scanner.next();
			if (("-").equals(strLine)) {
				break;
			}
			// 入れ替え回数
			int intCount = scanner.nextInt();

			for (int intI = 0; intI < intCount; intI++) {
				// 入れ替える文字数を入力して入れ替え
				int intNum = scanner.nextInt();
				strLine = strLine.substring(intNum) + strLine.substring(0,intNum);
			}
			System.out.println(strLine);
		}
	}
}

