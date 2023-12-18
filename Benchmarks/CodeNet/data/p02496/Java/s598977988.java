import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String [] type = {"S", "H", "C", "D"};
		int [][] cards = new int [4][14];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String m = sc.next();
			int no = sc.nextInt();
			if (m.equals("S")) {
				cards[0][no] = 1;
			} else if (m.equals("H")) {
				cards[1][no] = 1;
			} else if (m.equals("C")) {
				cards[2][no] = 1;
			} else {
				cards[3][no] = 1;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				if (cards[i][j] == 0) {
					System.out.println(type[i] + " " + j);
				}
			}
		}

	}

}