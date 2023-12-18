import java.util.Scanner;
import java.util.Stack;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * 総合面積を計算します。
	 * @param terrain
	 */
	private static void calcTotalArea(String terrain) {

		Stack<Integer> totalAreaStack = new Stack<>(); // 計算用スタック
		int totalArea = 0;                              // 総合面積

		// 総合面積の計算
		for (int i = 0; i < terrain.length(); i++) {
			if (terrain.charAt(i) == '\\') {
				totalAreaStack.push(i);
			} else if (terrain.charAt(i) == '/' && totalAreaStack.size() > 0) {
				int from = totalAreaStack.pop();
				totalArea += i - from;
			}
		}

		// 結果を保持
		stringBuilder.append(totalArea);
	}

	/**
	 * 各面積を計算します。
	 * @param terrain
	 */
	private static void calcEachArea(String terrain) {

		Stack<Integer> backslashStack = new Stack<>();
		Stack<Integer> slashStack = new Stack<>();
		Stack<Integer> eachAreaStack = new Stack<>();
		int eachArea = 0;

		// 各面積の計算
		for (int i = 0; i < terrain.length(); i++) {
			if (terrain.charAt(i) == '/' && backslashStack.size() > 0) {
				slashStack.push(i);
				int from = backslashStack.pop();
				int to = slashStack.pop();
				eachArea += to - from;
				if (backslashStack.size() <= slashStack.size() || (i == terrain.length() - 1 && eachArea > 0)) {
					eachAreaStack.push(eachArea);
					eachArea = 0;
				}
//			} else if (i == terrain.length() - 1 && backslashStack.size() > 0 && eachArea > 0) {
			} else if (i == terrain.length() - 1 && terrain.charAt(i) == '\\' && eachArea > 0) {
				eachAreaStack.push(eachArea);
				eachArea = 0;
			} else  if (terrain.charAt(i) == '\\') {
				backslashStack.push(i);
			} else if (terrain.charAt(i) == '/') {
				if (backslashStack.size() > 0) {
					slashStack.push(i);
				}
			}
		}

		// 結果出力用
		int size = eachAreaStack.size();
		stringBuilder.append(size);
		if (size != 0) {
			stringBuilder.append(" ");
		}
		for (int i = 0 ; i < size; i++) {
			stringBuilder.append(eachAreaStack.get(i));
			if (i < size - 1) {
				stringBuilder.append(" ");
			}
		}

	}

	/**
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// １行目の読み込み
		String terrain = scan.nextLine();

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算
		calcTotalArea(terrain);
		stringBuilder.append("\n");
		calcEachArea(terrain);

		// 結果出力
		System.out.println(stringBuilder.toString());

	}

}
