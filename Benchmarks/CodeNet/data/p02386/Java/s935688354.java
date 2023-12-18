import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int counter = scanner.nextInt();

		int dice[][] = new int[counter][6];
		for (int index = 0; index < counter; index++) {
			for (int index2 = 0; index2 < 6; index2++) {
				dice[index][index2] = scanner.nextInt();
			}
		}

		String answer = "Yes";
		int copy = 0;

		for (int dicenum = 0; dicenum < counter - 1; dicenum++) {
			for (int dicenum2 = dicenum + 1; dicenum2 < counter; dicenum2++) {

				String order = "NNNNWNNNWNNNENNNENNNWNNN";
				for (int count = 0; count < order.length(); count++) {
					// 先頭の文字から試行
					char command = order.charAt(count);
					// commmandによって配列を入れ替え
					if (command == 'N') {
						copy = dice[dicenum][0];
						dice[dicenum][0] = dice[dicenum][1];
						dice[dicenum][1] = dice[dicenum][5];
						dice[dicenum][5] = dice[dicenum][4];
						dice[dicenum][4] = copy;

					} else if (command == 'S') {
						copy = dice[dicenum][0];
						dice[dicenum][0] = dice[dicenum][4];
						dice[dicenum][4] = dice[dicenum][5];
						dice[dicenum][5] = dice[dicenum][1];
						dice[dicenum][1] = copy;

					} else if (command == 'W') {
						copy = dice[dicenum][0];
						dice[dicenum][0] = dice[dicenum][2];
						dice[dicenum][2] = dice[dicenum][5];
						dice[dicenum][5] = dice[dicenum][3];
						dice[dicenum][3] = copy;

					} else if (command == 'E') {
						copy = dice[dicenum][0];
						dice[dicenum][0] = dice[dicenum][3];
						dice[dicenum][3] = dice[dicenum][5];
						dice[dicenum][5] = dice[dicenum][2];
						dice[dicenum][2] = copy;

					}

					if (dice[dicenum][0] == dice[dicenum2][0] && dice[dicenum][1] == dice[dicenum2][1]
							&& dice[dicenum][2] == dice[dicenum2][2] && dice[dicenum][3] == dice[dicenum2][3]
							&& dice[dicenum][4] == dice[dicenum2][4] && dice[dicenum][5] == dice[dicenum2][5]) {
						answer = "No";
						break;
					}
				}
			}
		}
		System.out.println(answer);

	}
}

