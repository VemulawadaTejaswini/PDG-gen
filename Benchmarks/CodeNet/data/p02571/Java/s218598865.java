import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static String regex(int a, String s) {
		char c = s.charAt(a);

		String result = "";
		for (int i = 0; i < a; i++) {
			result += ".";
		}
		result = result + c;
		for (int i = a + 1; i < s.length(); i++) {
			result += ".";
		}
		return result;

	}

	// 何文字合致するか調べる
	private static int fit (String a, String b) {

		int result = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				result++;
			}
		}
		return result;
	}

//	public static void main(String[] args) {
//		System.out.println(regex(2, "aaa"));
//	}

	// 一切、存在しない場合
	//

	public static void solve (String S, String T) {

		int maxFit = 0;
		for (int i = 0; i < T.length(); i++) {
			Pattern p =Pattern.compile(regex(i, T));
			Matcher m = p.matcher(S);

			// 文字数と１文字あうだけを調べていく。
			if (m.find()) {
				String val = m.group();
				int fit = fit(val, T);
				if (fit == T.length()) {
					System.out.println("0");
					return;
				}
				// 入れ替え
				if (fit > maxFit) {
					maxFit = fit;
					continue;
				}
			}
		}

		System.out.println(T.length()  - maxFit);

	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			String S  = scanner.next();
			scanner.nextLine();
			String T  = scanner.next();
			scanner.nextLine();

			solve(S, T);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String line) {

		String[] strArray = line.split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
