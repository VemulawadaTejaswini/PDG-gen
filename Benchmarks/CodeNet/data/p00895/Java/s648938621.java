import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int H = scan.nextInt();
			if (H == 0) {
				scan.close();
				break;
			}
			int W = scan.nextInt();

			char[][] table = new char[H][];
			for (int i = 0; i < table.length; i++) {
				// 与えられるテーブルをしまっておく
				table[i] = scan.next().toCharArray();
			}

			String answer = "";// 解答
			int[] dir = { -1, 0, 1 };// 方向

			@SuppressWarnings("unchecked")
			ArrayList<String>[][] parts = new ArrayList[26][201];// [頭文字][長さ]の文字列を格納する
			for (int i = 0; i < parts.length; i++) {
				for (int j = 0; j < parts[i].length; j++) {
					parts[i][j] = new ArrayList<String>();
				}
			}

			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					for (int k = 0; k < dir.length; k++) {
						for (int l = 0; l < dir.length; l++) {
							if (dir[k] == dir[l] && dir[k] == 0) {
								continue;
							}

							int nowi = i;
							int nowj = j;
							StringBuilder sb = new StringBuilder();
							sb.append(table[nowi][nowj]);

							while (true) {
								nowi = (nowi + dir[k] + H) % H;
								nowj = (nowj + dir[l] + W) % W;

								if (nowi == i && nowj == j) {
									// 元の場所に戻ってきてたら終わる
									break;
								}

								sb.append(table[nowi][nowj]);// 文字を後ろに付け加える

								char init = (char) (table[i][j] - 'A');// 頭文字
								String seq = sb.toString();// 文字列
								int length = sb.length();// 文字列の長さ

								if (parts[init][length].contains(seq)) {
									if (length > answer.length()) {
										answer = seq;
									} else if (length == answer.length()) {
										// 文字列の長さが同じ時は辞書順で前のやつを採用する
										if (answer.compareTo(seq) > 0) {
											answer = seq;
										}
									}
								} else if (length >= 2) {
									// 2文字以上ならリストに加えておく
									parts[init][length].add(seq);
								}
							}
						}
					}

				}
			}
			if (answer.equals("")) {
				System.out.println(0);
			} else {
				System.out.println(answer);
			}
		}

	}
}