import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> strInput = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		// 検索する単語を入力
		String strWord = scanner.next();

		int intLineNum = 0;
		// 検索対象の文章を入力
		while (true) {
			String strLine = scanner.next();
			// END_OF_TEXTで終了
			if (("END_OF_TEXT").equals(strLine)) {
				break;
			}

			strInput.add(strLine);
			intLineNum++;
		}

		int intCount = 0;
		for (int intI = 0; intI < intLineNum; intI++) {
			if (strWord.equalsIgnoreCase(strInput.get(intI))) {
				intCount++;
			}
		}
		System.out.println(intCount);
	}

}

