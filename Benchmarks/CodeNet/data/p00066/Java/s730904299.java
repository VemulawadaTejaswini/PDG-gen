import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] line = new char[8][3];
		while (in.hasNext()) {
			char[] masu = in.nextLine().toCharArray();
			for (int i = 0; i < 3; i++) {
				line[i][0] = masu[i * 3];
				line[i][1] = masu[i * 3 + 1];
				line[i][2] = masu[i * 3 + 2];
				final int tate = i + 3;
				line[tate][0] = masu[i];
				line[tate][1] = masu[i + 3];
				line[tate][2] = masu[i + 6];
			}
			line[6][0] = masu[0];
			line[6][1] = masu[4];
			line[6][2] = masu[8];
			line[7][0] = masu[2];
			line[7][1] = masu[4];
			line[7][2] = masu[6];
			char winner = 'd';
			for (int i = 0; i < 8; i++) {
				if (line[i][0] != 'd' && line[i][0] == line[i][1]
						&& line[i][1] == line[i][2]) {
					winner = line[i][0];
					break;
				}
			}
			System.out.println(winner);
		}

	}
}