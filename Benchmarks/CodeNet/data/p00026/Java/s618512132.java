import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[][] board = new int[10][10];

	public static void main(String[] args) throws IOException {
		// 宣言
		Scanner sc = new Scanner(System.in);
		String[] str;
		int count = 0;
		int max = 0;

		while (sc.hasNext()) {
			str = sc.nextLine().split(",");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int size = Integer.parseInt(str[2]);
			if (size == 1) {
				small(x, y);
			} else if (size == 2) {
				middle(x, y);
			} else if (size == 3) {
				big(x, y);
			}
		}
		for (int xx = 0; xx < 10; xx++) {
			for (int yy = 0; yy < 10; yy++) {
				// 1個目の答え
				if (board[xx][yy] == 0) {
					count++;
				}
				// 2個目の答え
				if (max < board[xx][yy]) {
					max = board[xx][yy];
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}

	// インク小　中心と上下左右1マス
	static void small(int x, int y) {
		paint(x, y);
		// 左右、上下のマスを塗る
		paint(x + 1, y);
		paint(x - 1, y);
		paint(x, y - 1);
		paint(x, y + 1);
	}
	// インク中　上下左右斜め9マス
	static void middle(int x, int y) {
		for (int yr = -1; yr <= 1; yr++) {
			for (int xr = -1; xr <= 1; xr++) {
				paint(x + xr, y + yr);
			}
		}
	}
	//　インク大　インク中＋上下左右2マス
	static void big(int x, int y) {
		middle(x, y);
		//左右、上下の2マス目を塗る
		paint(x, y - 2);
		paint(x, y + 2);
		paint(x + 2, y);
		paint(x - 2, y);
	}

	static void paint(int x, int y) {
		//範囲外にあたる場合は何もしない
		if (x < 0 || y < 0 || x >= 10 || y >= 10) {
			return;
		} else {
			board[x][y] += 1;
		}

	}

}