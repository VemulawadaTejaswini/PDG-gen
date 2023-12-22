import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		char[][] ans = new char[100][100];
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				ans[i][j] = '.';
			}
		}
		for (int i = 50; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				ans[i][j] = '#';
			}
		}

		a--;
		int x = 99;
		int y = 0;
		while (a > 0) {
			ans[x][y] = '.';
			y += 2;
			if (y >= 100) {
				y = 0;
				x -= 2;
			}
			a--;
		}

		b--;
		x = 0;
		y = 0;
		while (b > 0) {
			ans[x][y] = '#';
			y += 2;
			if (y >= 100) {
				y = 0;
				x += 2;
			}
			b--;
		}

		System.out.println("100 100");
		for (int i = 0; i < 100; i++) {
			System.out.println(ans[i]);
		}
	}
}
