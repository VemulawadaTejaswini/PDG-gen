package Hello_world;

import java.util.Scanner;

public class Chessboard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		String[] a = temp.split(" ");

		int H = Integer.parseInt(a[0]);
		int W = Integer.parseInt(a[1]);
		int flag = 0;

		while ((1 <= H && 300 >= H) && (1 <= W && 300 >= W)) {
			for (int x = 0; x < H; x++) {
				for (int y = 0; y < W; y++) {
					if (y % 2 == flag) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}

				}
				if (flag == 1)
					flag = 0;
				else
					flag = 1;
				// System.out.println(flag);
				System.out.println(" ");
			}
			flag =0;
			String temp1 = scanner.nextLine();
			String[] a1 = temp1.split(" ");
			H = Integer.parseInt(a1[0]);
			W = Integer.parseInt(a1[1]);
		}

	}
}