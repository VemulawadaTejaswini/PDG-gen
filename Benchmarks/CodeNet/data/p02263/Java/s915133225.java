import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/**
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// 対象文字列の読み込み
		String[] targetArray = scan.nextLine().split(" ");

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		int answer = calculation(targetArray);

		// 結果出力
		System.out.println(answer);

	}

	/**
	 * 与えられた逆ポーランド記法の文字列を計算する
	 * @param targetStack
	 */
	private static int calculation(String[] targetArray) {

		// 計算用スタック
		Stack<Integer> targetStack = new Stack<>();

		// 数字の正規表現
		Pattern pattern = Pattern.compile("^[0-9]*$");

		// 計算
		for (int i = 0; i < targetArray.length; i++) {
			if (!pattern.matcher(targetArray[i]).matches()) {

				if (targetArray[i].equals("+")) {
					targetStack.push(targetStack.pop() + targetStack.pop());
				} else if (targetArray[i].equals("-")) {
					targetStack.push(-targetStack.pop() + targetStack.pop());
				} else if (targetArray[i].equals("*")) {
					targetStack.push(targetStack.pop() * targetStack.pop());
				}
			} else {
				targetStack.push(Integer.parseInt(targetArray[i]));
			}
		}

		return targetStack.pop();
	}

}

