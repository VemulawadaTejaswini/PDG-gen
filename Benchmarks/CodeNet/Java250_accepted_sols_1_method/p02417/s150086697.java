import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char Character[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		ArrayList<String> strInput = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		int intLineNum = 0;
		while (scanner.hasNext()) {
			String strLine = scanner.nextLine();

			//if (strLine.length() == 0) {
			//	break;
			//}

			strInput.add(strLine);
			intLineNum++;
		}

			for (int intI = 0; intI < 26; intI++) {
				int intCounter = 0;
				for (int intJ = 0; intJ < intLineNum; intJ++) {
					for (int intK = 0; intK < strInput.get(intJ).length(); intK++) {
						char charLine = strInput.get(intJ).charAt(intK);
							String strMoji = String.valueOf(charLine);
							String strChar = String.valueOf(Character[intI]);
							if (strMoji.equalsIgnoreCase(strChar)) {
								intCounter++;
							}
					}
				}
				System.out.println(Character[intI] + " : " + intCounter);
			}
	}

}

