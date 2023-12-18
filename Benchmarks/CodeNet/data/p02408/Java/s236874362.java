import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int[][] cards = new int[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = 0;
			}
		}
		for (int k = 1; k <= n; k++) {
			String str = in.next();
			int num = Integer.parseInt(in.next());
			switch (str) {
			case "S":
				cards[0][num - 1] = 1;
				break;
			case "H":
				cards[1][num - 1] = 1;
				break;
			case "C":
				cards[2][num - 1] = 1;
				break;
			case "D":
				cards[3][num - 1] = 1;
				break;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (cards[i][j] == 0) {
					switch (i) {
					case 0:
						System.out.println("S" + " " + (j + 1));
						break;
					case 1:
						System.out.println("H" + " " + (j + 1));
						break;
					case 2:
						System.out.println("C" + " " + (j + 1));
						break;
					case 3:
						System.out.println("D" + " " + (j + 1));
						break;
					}
				}
			}
		}
	}
}	
