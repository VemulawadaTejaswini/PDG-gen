import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); // 入力する数字の個数を設定
		boolean[][] a; // 特定多数の数字を入れるため配列aを設定
		a = new boolean[4][13];

		for (int i = 0; i < n; i++) {
			String mark = scanner.next();
			int runk = scanner.nextInt();

			if (mark.equals("S")) {
				a[0][runk - 1] = true;

			}
			if (mark.equals("H")) {
				a[1][runk - 1] = true;

			}
			if (mark.equals("C")) {
				a[2][runk - 1] = true;

			}
			if (mark.equals("D")) {
				a[3][runk - 1] = true;
			}
			

		}
		for (int i = 0; i < 13; i++) {
			if (a[0][i]) {
			} else {
				System.out.println("S " + (i + 1));
			}
		}

		for (int i = 0; i < 13; i++) {
			if (a[1][i]) {
			} else {
				System.out.println("H " + (i + 1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if (a[2][i]) {
			} else {
				System.out.println("C " + (i + 1));
			}
		}
		for (int i = 0; i < 13; i++) {
			if (a[3][i]) {
			} else {
				System.out.println("D " + (i + 1));
			}
		}
		scanner.close();

	}
}

