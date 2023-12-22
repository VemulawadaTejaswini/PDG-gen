import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] cellAry = new String[3];		// 3行分の文字を格納する配列
		Scanner sc = new Scanner(System.in);

		// 入力された3文字を受け取る
		for (int i = 0; i < cellAry.length; i++) {
			cellAry[i] = sc.nextLine();
		}

		// 前からi番目の1文字だけを表示する処理
		for (int i = 0; i < cellAry.length; i++) {
			System.out.print(cellAry[i].charAt(i));
		}

	}
}