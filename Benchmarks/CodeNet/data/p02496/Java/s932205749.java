import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] cards = new int[4][13];
		int i, j;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 13; j++) {
				cards[i][j] = 1;
			}
		}
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			String mark = sc.next();
			int suuji = sc.nextInt();
			int markint;
			if (mark == "S") {
				markint = 0;
				cards[markint][suuji-1] = 0;
			} else if (mark == "H") {
				markint = 1;
				cards[markint][suuji-1] = 0;
			} else if (mark == "C") {
				markint = 2;
				cards[markint][suuji-1] = 0;
			} else if (mark == "D") {
				markint = 3;
				cards[markint][suuji-1] = 0;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 13; j++) {
				if (i == 0 & cards[i][j] == 1) {
					System.out.println("S " + j+1);
				}else if (i == 1 & cards[i][j] == 1) {
					System.out.println("H " + j+1);
				}else if (i == 2 & cards[i][j] == 1) {
					System.out.println("C " + j+1);
				}else if (i == 3 & cards[i][j] == 1) {
					System.out.println("D " + j+1);
				}
			}
		}
	}
}