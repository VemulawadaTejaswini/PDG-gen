import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji;
		int[][] cards = new int[5][14];
		int i, j;
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 14; j++) {
				cards[i][j] = 1;
			}
		}
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			String mark = sc.next();
			int suuji = sc.nextInt();
			int markint;
			if (mark == "S") {
				markint = 1;
				cards[markint][suuji] = 0;
			} else if (mark == "H") {
				markint = 2;
				cards[markint][suuji] = 0;
			} else if (mark == "C") {
				markint = 3;
				cards[markint][suuji] = 0;
			} else if (mark == "D") {
				markint = 4;
				cards[markint][suuji] = 0;
			}
		}
		for (i = 1; i < 5; i++) {
			for (j = 1; j < 14; j++) {
				if (i == 1 & cards[i][j] == 1) {
					moji = "S";
					System.out.println(moji + " " + j);
				}else if (i == 2 & cards[i][j] == 1) {
					moji = "H";
					System.out.println(moji + " " + j);
				}else if (i == 3 & cards[i][j] == 1) {
					moji = "C";
					System.out.println(moji + " " + j);
				}else if (i == 4 & cards[i][j] == 1) {
					moji = "D";
					System.out.println(moji + " " + j);
				}
			}
		}
	}
}