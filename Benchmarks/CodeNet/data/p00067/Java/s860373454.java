import java.util.Scanner;

public class Main {
	static int island[][] = new int[12][12];

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		while (start) {
			// 島を配列islandで定義
			// 1か0を入力し島を形成
			for (int length = 0; length < 12; length++) {
				String line = scanner.nextLine();
				for (int side = 0; side < 12; side++) {
					char area = line.charAt(side);
					island[length][side] = Character.getNumericValue(area);
				}
			}

			// 島の数islandの宣言、初期化
			int islandcount = 0;
			// 島を見つける
			for (int length = 0; length < 12; length++) {
				for (int side = 0; side < 12; side++) {
					if (island[length][side] == 1) {
						islandcount++;
						islandnumber(length, side);
						island[length][side] = -1;
					}
				}
			}
			System.out.println(islandcount);
			if (scanner.hasNext()) {
				String space = scanner.nextLine();
			} else {
				start = false;
			}
		}
	}

	static void islandnumber(int a, int b) {
		island[a][b] = -5;
		if (a != island.length - 1 && island[a + 1][b] == 1) {
			islandnumber(a + 1, b);
		}
		if (a != 0 && island[a - 1][b] == 1) {
			islandnumber(a - 1, b);
		}
		if (b != island.length - 1 && island[a][b + 1] == 1) {
			islandnumber(a, b + 1);
		}
		if (b != 0 && island[a][b - 1] == 1) {
			islandnumber(a, b - 1);
		}
	}
}
