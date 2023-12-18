import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] c = new char[H+ 2][W + 2];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				c[i + 1][j + 1] = s.charAt(j);
			}
		}
		int count = 0;
		for (int i = 0; i < H ; i++) {
			for (int j = 0 ; j < W ; j++) {
				if (c[i + 1][j + 1] == '#' && c[i][j + 1]  != '#' && c[i + 1][j] != '#' && c[i+2][j + 1] != '#' && c[i + 1][j+2] != '#') {
					count++;
				}
			}
		}

		if (count > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}