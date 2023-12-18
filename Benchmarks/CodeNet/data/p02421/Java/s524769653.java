import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 得点カウント
		int player1Score = 0, player2Score = 0;

		// 勝負の回数(カード枚数)
		int round = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < round; i++) {
			String[] cards = sc.nextLine().split("[\\s]+");
			// あいこの場合はお互いに+1
			if (cards[0].equals(cards[1])) {
				player1Score++;
				player2Score++;
				// player1,player2の順で勝利判定に渡す
			} else if (VictoryDecision(cards[0], cards[1])) {
				player1Score += 3;
			} else {
				player2Score += 3;
			}

		}

		// 出力
		System.out.println(player1Score + " " + player2Score);

	}

	// 勝利判定
	static boolean VictoryDecision(String str1, String str2) {
		// 文字列が短いほうにループ回数と勝利フラグをあわせる
		int looplimit = str1.length();
		boolean Victoryflag = false;
		if (str1.length() > str2.length()) {
			looplimit = str2.length();
			Victoryflag = true;
		}
		for (int i = 0; i < looplimit; i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				continue;
			} else {
				// 違う文字が出た場合文字のアルファベット順で判定
				return CharDecision(str1.charAt(i), str2.charAt(i));
			}
		}
		return Victoryflag;
	}

	// 1文字の判定
	static boolean CharDecision(char a, char b) {
		if ((int) a > (int) b) {
			return true;
		} else {
			return false;
		}
	}

}

