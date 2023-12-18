import java.util.Scanner;

public class Main {

	static final String[] marks = { "S", "H", "C", "D" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[][] card = new boolean[4][13];
		for (int i = 0; i < n; i++) {
			String mark = sc.next();
			int number = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				if (mark.equals(marks[j])) {
					card[j][number - 1] = true;
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (!card[i][j]) {
					System.out.println(marks[i] + " " + (j + 1));
				}
			}
		}

		sc.close();

	}
}