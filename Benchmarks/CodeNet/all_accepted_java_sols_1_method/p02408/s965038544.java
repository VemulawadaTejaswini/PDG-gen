import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			sc.nextLine();
			String[] cards = new String[n];
			int[][] table = new int[4][13];
			for (int i=0; i < 4; i++) {
				for (int j=0; j < 13; j++) {
					table[i][j] = 0;  //初期化
				}
			}

			for (int i = 0; i<n; i++) {
				cards[i] = sc.nextLine();
				String simbol = cards[i].substring(0, 1);
				int no = Integer.parseInt(cards[i].substring(2));

				switch (simbol) {
				case "S":
					table[0][no - 1] = 1;
					break;

				case "H":
					table[1][no - 1] = 1;
					break;

				case "C":
					table[2][no - 1] = 1;
					break;

				case "D":
					table[3][no - 1] = 1;
					break;
				}
			}

			for (int i=0; i < 4; i++) {
				for (int j=0; j < 13; j++) {
					if (table[i][j] == 0) {
						switch (i) {
						case 0:
							System.out.print("S ");
							break;

						case 1:
							System.out.print("H ");
							break;

						case 2:
							System.out.print("C ");
							break;

						case 3:
							System.out.print("D ");
							break;
						}
						System.out.println(j+1);
					}
				}
			}
		}
	}
}
