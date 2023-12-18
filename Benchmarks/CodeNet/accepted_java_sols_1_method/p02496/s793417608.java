import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[][] card = new boolean[4][13];
		for (int i = 0; i < n; i++) {
			String mark = sc.next();
			int number = sc.nextInt();
			if (mark.equals("S")) {
				card[0][number - 1] = true;
			} else if (mark.equals("H")) {
				card[1][number - 1] = true;
			} else if (mark.equals("C")) {
				card[2][number - 1] = true;
			} else if (mark.equals("D")) {
				card[3][number - 1] = true;
			}
		}

		for (int i = 0; i < 13; i++) {
			if (!card[0][i]) {
				System.out.println("S " + (i + 1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if (!card[1][i]) {
				System.out.println("H " + (i + 1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if (!card[2][i]) {
				System.out.println("C " + (i + 1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if (!card[3][i]) {
				System.out.println("D " + (i + 1));
			}
		}

		sc.close();

	}
}