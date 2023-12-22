import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] cards = new int[4][13];
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		final String S = "S", H = "H", C = "C", D = "D";
		for (int i=0; i<n; i++) {
			String mark = sc.next();
			int num = sc.nextInt() - 1;
			if (mark.equals(S)) {
				cards[0][num] = 1;
			} else if (mark.equals(H)) {
				cards[1][num] = 1;
			} else if (mark.equals(C)) {
				cards[2][num] = 1;
			} else if (mark.equals(D)) {
				cards[3][num] = 1;
			} else {
				System.exit(1);
			}
		}
		sc.close();
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				switch (i) {
				case 0:
					if (cards[i][j] == 0) System.out.println(S + " " + (j+1));
					break;
				case 1:
					if (cards[i][j] == 0) System.out.println(H + " " + (j+1));
					break;
				case 2:
					if (cards[i][j] == 0) System.out.println(C + " " + (j+1));
					break;
				case 3:
					if (cards[i][j] == 0) System.out.println(D + " " + (j+1));
					break;
				}
			}
		}
	}
}