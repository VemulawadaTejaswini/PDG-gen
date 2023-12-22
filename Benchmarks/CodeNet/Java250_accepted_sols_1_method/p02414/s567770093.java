import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// intN,intM,intLを入力
		int intN = scanner.nextInt();
		int intM = scanner.nextInt();
		int intL = scanner.nextInt();

		long[][] longA = new long[intN][intM];
		for (int intI = 0; intI < intN; intI++) {
			for (int intJ = 0; intJ < intM; intJ++) {
				// 配列longAに数値を入力する
				longA[intI][intJ] = scanner.nextInt();
			}
		}

		long[][] longB = new long[intM][intL];
		for (int intO = 0; intO < intM; intO++) {
			for (int intP = 0; intP < intL; intP++) {
				// 配列longBに数値を入力する
				longB[intO][intP] = scanner.nextInt();
			}
		}
		//long[][] longC = new long[intN][intL];
		long longC = 0;
		for (int intX = 0; intX < intN; intX++) {
			for (int intY = 0; intY < intL; intY++) {
				for (int intZ = 0; intZ < intM; intZ++) {
					longC += longA[intX][intZ] * longB[intZ][intY];
						if (intZ == intM -1) {
							if (!(intY == intL -1)) {
								System.out.print(longC + " ");
								longC = 0;
							} else if (intY == intL - 1) {
								System.out.println(longC);
								longC = 0;
							}
						}
				}
			}
		}

	}
}

