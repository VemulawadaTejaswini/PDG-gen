import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int h = sc.nextInt();
			int w = sc.nextInt();
			sc.nextLine();

			String[][] pic = new String[h][w];
			for (int i = 0; i < h; i++) {
				pic[i] = sc.nextLine().split("");
			}

			int i2 = -1;
			for (int i = 0; i < h * 2; i++) {
				i2 = ((i + 2) / 2) - 1;
				for (int j = 0; j < w; j++) {
					System.out.print(pic[i2][j]);
				}
				System.out.println();
			}

		} finally {
			sc.close();
		}
	}
}