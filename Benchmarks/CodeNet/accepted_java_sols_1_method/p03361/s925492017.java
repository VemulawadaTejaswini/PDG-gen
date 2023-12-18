import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numH = scan.nextInt();
		int numW = scan.nextInt();

		char[][] charBef = new char[numH + 2][numW + 2];

		for (int j = 0; j <= numW + 1; j++) {
			charBef[0][j] = '.';
			charBef[numH + 1][j] = '.';
		}

		for (int i = 1; i <= numH; i++) {
			StringBuilder strSB = new StringBuilder();
			strSB.append(".");
			strSB.append(scan.next());
			strSB.append(".");
			charBef[i] = strSB.toString().toCharArray();
		}

		String result = "Yes";

		for (int i = 1; i <= numH; i++) {
			for (int j = 1; j <= numW; j++) {

				if (charBef[i][j] == '#') {
					if (charBef[i - 1][j] == '#' || charBef[i][j - 1] == '#' || charBef[i + 1][j] == '#'
							|| charBef[i][j + 1] == '#') {
						continue;
					} else {
						result = "No";
					}
				}
			}
		}

		System.out.println(result);
	}
}
