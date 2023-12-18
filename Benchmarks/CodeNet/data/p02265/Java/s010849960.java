import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

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
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// １行目（命令数）の読み込み
		int size = Integer.parseInt(scan.next());

		// 計算用連結リスト
		Deque<String> deque = new ArrayDeque<>();

		// 2行目以降（命令）の読み込み
		for (int i = 0; i < size; i++) {
			String command = scan.next();
			if (command.equals("insert")) {
				deque.push(scan.next());
			} else if (command.equals("delete")) {
				deque.remove(scan.next());
			} else if (command.equals("deleteFirst")) {
				deque.pollFirst();
			} else {
				deque.pollLast();
			}
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 結果出力
		for (int i = deque.size() - 1; i >= 0; i--) {
			stringBuilder.append(deque.getLast());

			if (i > 0) {
				stringBuilder.append(" ");
			}
		}

		System.out.println(stringBuilder.toString());

	}

}
