import java.util.LinkedList;
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
//	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// １行目の読み込み
		int commandNum = Integer.parseInt(scan.nextLine());

		// 2行目以降（プロセスとクオンタム）の読み込み
		String[] commands = new String[commandNum];
		for (int i = 0; i < commandNum; i++) {
			commands[i] = scan.nextLine();
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		LinkedList<Integer> list = execution(commandNum, commands);

		// 結果出力
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.print(list.poll() + (i < size - 1 ? " " : "\n"));
		}

	}

	/**
	 *
	 * @param commandNum
	 * @param commands
	 */
	private static LinkedList<Integer> execution(int commandNum, String[] commands) {

		// 計算用リスト
		LinkedList<Integer> linkedList = new LinkedList<>();

		// キューの中身がなくなるまで計算
		for (int i = 0; i < commandNum; i++) {
			// コマンドを一つ取得
			String[] command = commands[i].split(" ");

			// コマンドごとの処理を実行
			if (command[0].equals("insert")) {
				linkedList.push(Integer.parseInt(command[1]));
			} else if (command[0].equals("delete")) {
				linkedList.remove(linkedList.indexOf(Integer.parseInt(command[1])));
			} else if (command[0].equals("deleteFirst")) {
				linkedList.removeFirst();
			} else if (command[0].equals("deleteLast")) {
				linkedList.removeLast();
			}
		}

		return linkedList;

	}

}

