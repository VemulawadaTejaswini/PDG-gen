import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int player1 = 0, player2 = 0;

		int round = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < round; i++) {
			String[] cards = sc.nextLine().split("[\\s]+");
			if (cards[0].equals(cards[1])) {
				player1++;
				player2++;
			} else if (VictoryDecision(cards[1], cards[0])) {
				player1 += 3;
			} else {
				player2 += 3;
			}

		}

		System.out.println(player1 + " " + player2);

	}

	static boolean VictoryDecision(String str1, String str2) {
		int looplimit = str1.length();
		boolean defVictory = true;
		if (str1.length() > str2.length()) {
			looplimit = str2.length();
			defVictory = false;
		}
		for (int i = 0; i < looplimit; i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				continue;
			} else {
				return CharDecision(str1.charAt(i), str2.charAt(i));
			}
		}
		return defVictory;
	}

	static boolean CharDecision(char a, char b) {
		if ((int) a < (int) b) {
			return true;
		} else {
			return false;
		}
	}

}

