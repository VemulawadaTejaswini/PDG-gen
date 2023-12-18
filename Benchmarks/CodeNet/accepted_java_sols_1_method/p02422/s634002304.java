import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// 文字列入力strLine
		String strLine = scanner.next();
		// 命令回数intCommand
		int intCount = scanner.nextInt();

		for (int intI = 0; intI < intCount; intI++) {
			// 命令strCommand入力
			String strCommand = scanner.next();
			// 各条件で処理
			if (("print").equals(strCommand)) {
				int intBegin = scanner.nextInt();
				int intEnd = scanner.nextInt();
				System.out.println(strLine.substring(intBegin, intEnd + 1));

			} else if (("reverse").equals(strCommand)) {
				int intBegin = scanner.nextInt();
				int intEnd = scanner.nextInt();
				// 指定部分を切り抜き反転し置換
				StringBuilder strReverse = new StringBuilder(strLine.substring(intBegin, intEnd + 1));
				strReverse.reverse();
				StringBuilder strReLine = new StringBuilder(strLine);
				strReLine.replace(intBegin, intEnd + 1, strReverse.toString());
				// strLineを上書き
				strLine = strReLine.toString();

			} else if (("replace").equals(strCommand)) {
				int intBegin = scanner.nextInt();
				int intEnd = scanner.nextInt();
				// 置換する文字列strReplace読み込み
				String strReplace = scanner.next();
				StringBuilder strReLine = new StringBuilder(strLine);
				// intBegin～intEnd文字目をstrReplaceに置換
				strReLine.replace(intBegin, intEnd + 1, strReplace);
				// strLineにstrReLineで上書き
				strLine = strReLine.toString();
			}
		}
	}
}

