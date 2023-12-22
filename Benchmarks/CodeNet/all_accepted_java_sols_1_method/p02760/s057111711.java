import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		final int opened = -1;
		Scanner sc = new Scanner(System.in);

		//入力
		int [][]bingo = new int[3][3];
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				bingo[x][y] = Integer.parseInt(sc.next());
			}
		}
		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(sc.next());
			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 3; x++) {
					if (bingo[x][y] == b) bingo[x][y] = opened;
				}
			}
		}

		//条件チェック
		boolean is_bingo = false;
		//縦
		for (int y = 0; y < 3; y++) {
			boolean width = true;
			for (int x = 0; x < 3; x++) {
				if (bingo[x][y] != opened) {
					width = false;
					break;
				}
			}
			if (width) is_bingo = true;
		}
		//横
		for (int x = 0; x < 3; x++) {
			boolean height = true;
			for (int y = 0; y < 3; y++) {
				if (bingo[x][y] != opened) {
					height = false;
					break;
				}
			}
			if (height) is_bingo = true;
		}
		//斜め
		if (bingo[2][0] == opened && bingo[1][1] == opened && bingo[0][2] == opened) {
			is_bingo = true;
		}
		if (bingo[0][0] == opened && bingo[1][1] == opened && bingo[2][2] == opened) {
			is_bingo = true;
		}

		if (is_bingo) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		/*for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(bingo[x][y] + " ");
			}
			System.out.println();
		}*/
	}
}