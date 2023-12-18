import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[][] board = new int[10][10];

	public static void main(String[] args) throws IOException {
		// 宣言
		Scanner sc = new Scanner(System.in);
		String[] str;

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

		int count = 0;
		int max = 0;

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

	static void small(int x, int y) {
		int smallx[] = { 1, 0, -1, 0 };
		int smally[] = { 0, 1, 0, -1 };
		paint(x, y);
		for (int i = 0; i < 4; i++) {
			int nx = smallx[i] + x;
			int ny = smally[i] + y;
			paint(nx, ny);
		}
	}

	static void middle(int x, int y) {
		for (int yrange = -1; yrange <= 1; yrange++) {
			for (int xrange = -1; xrange <= 1; xrange++) {
				paint(x + xrange, y + yrange);
			}
		}
	}

	static void big(int x, int y) {
		middle(x, y);
		paint(x, y - 2);
		paint(x, y + 2);
		paint(x + 2, y);
		paint(x - 2, y);
	}

	static void paint(int x, int y) {
		if (x < 0 || y < 0 || x >9 || y >9) {
			return;
		} else {
			board[x][y] += 1;
		}
		
	}

}