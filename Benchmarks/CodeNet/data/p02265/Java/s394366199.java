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

		// １行目（命令数）の読み込み
		String firstLine = scan.nextLine();
		int size = Integer.parseInt(firstLine);

		// 2行目以降（命令）の読み込み
		String[] commands = new String[size];
		for (int i = 0; i < size; i++) {
			commands[i] = scan.nextLine();
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		LinkedList<String> linkedList = execution(size, commands);

		// 結果出力
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			System.out.print(linkedList.get(i));

			if (i > 0) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}

	}

	private static void print(LinkedList<String> linkedList) {
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			System.out.print(linkedList.get(i) + " ");
		}
		System.out.println();
	}

	/**
	 *
	 * @param size
	 * @param commands
	 */
	private static LinkedList<String> execution(int size , String[] commands) {

		// 計算用連結リスト
		LinkedList<String> linkedList = new LinkedList<>();

		//
		for (int i = 0; i < commands.length; i++) {
			String[] command = commands[i].split(" ");

			if (command[0].equals("insert")) {
				linkedList.add(command[1]);
			} else if (command[0].equals("delete")) {
				int index = linkedList.lastIndexOf(command[1]);
				if (index > -1) {
					linkedList.remove(index);
				}
			} else if (command[0].equals("deleteFirst")) {
				linkedList.removeLast();
			} else if (command[0].equals("deleteLast")) {
				linkedList.removeFirst();
			}

//			print(linkedList);
		}

		return linkedList;

	}

}
