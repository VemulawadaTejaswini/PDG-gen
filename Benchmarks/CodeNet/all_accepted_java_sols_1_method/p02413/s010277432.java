import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\???
		Scanner sc = new Scanner(System.in);

		// ??\??????????????°???????????¨?????¨???????¬??????????????????????
		int line = sc.nextInt();
		int column = sc.nextInt();

		int[][] table = new int[line + 1][column + 1];

		for (int cnt1 = 0; cnt1 < line; cnt1++) {

			for (int cnt2 = 0; cnt2 < column; cnt2++) {

				table[cnt1][cnt2] = sc.nextInt();
				table[cnt1][column] += table[cnt1][cnt2];
				table[line][cnt2] += table[cnt1][cnt2];
			}
			table[line][column] += table[cnt1][column];
		}

		for (int cnt1 = 0; cnt1 <= line; cnt1++) {

			for (int cnt2 = 0; cnt2 <= column; cnt2++) {

				if (cnt2 != column) {
					System.out.print(table[cnt1][cnt2] + " ");

				} else {
					System.out.println(table[cnt1][cnt2]);
				}
				sc.close();
			}
		}
	}
}