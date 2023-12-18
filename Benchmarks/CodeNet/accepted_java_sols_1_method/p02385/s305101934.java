import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 配列diceとcopydiceに数値を格納
		int dice[] = new int[6];
		int copydice[] = new int[6];
		for (int i = 0; i < 6; i++) {
			dice[i] = scanner.nextInt();
			copydice[i] = dice[i];
		}
		int dice2[] = new int[6];
		// 配列dice2に数値を格納
		for (int i2 = 0; i2 < 6; i2++) {
			dice2[i2] = scanner.nextInt();
		}
		// 乱数でdiceを転がす
		//Random random = new Random();
		//int count = 0;
		//while (true) {
			//int command = (1 + random.nextInt(4));
		String order ="NNNNWNNNWNNNENNNENNNWNNN";
		for (int count = 0; count < order.length(); count++) {
			char command = order.charAt(count);
			if (command == 'N') {
				dice[0] = copydice[1];
				dice[1] = copydice[5];
				dice[4] = copydice[0];
				dice[5] = copydice[4];

				for (int surface = 0; surface < 6; surface++) {
					copydice[surface] = dice[surface];
				}
			} else if (command == 'S') {
				dice[0] = copydice[4];
				dice[1] = copydice[0];
				dice[4] = copydice[5];
				dice[5] = copydice[1];

				for (int surface = 0; surface < 6; surface++) {
					copydice[surface] = dice[surface];
				}
			} else if (command == 'W') {
				dice[0] = copydice[2];
				dice[2] = copydice[5];
				dice[3] = copydice[0];
				dice[5] = copydice[3];

				for (int surface = 0; surface < 6; surface++) {
					copydice[surface] = dice[surface];
				}
			} else if (command == 'E') {
				dice[0] = copydice[3];
				dice[2] = copydice[0];
				dice[3] = copydice[5];
				dice[5] = copydice[2];

				for (int surface = 0; surface < 6; surface++) {
					copydice[surface] = dice[surface];
				}
			}

			if (dice[0] == dice2[0] && dice[1] == dice2[1] && dice[2] == dice2[2]
					&& dice[3] == dice2[3] && dice[4] == dice2[4] && dice[5] == dice2[5]) {
				break;
			}
			//if (count == 1000) {
				//break;
			//}
			//count++;
		}
		if (dice[0] == dice2[0] && dice[1] == dice2[1] && dice[2] == dice2[2]
				&& dice[3] == dice2[3] && dice[4] == dice2[4] && dice[5] == dice2[5]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

