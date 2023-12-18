
import java.util.*;

public class Main {
	static int W, H;
	static char[][] tile;

	static int move(int x, int y) {
		int count = 1;

		if (y + 1 < H) {
			if (tile[y + 1][x] == '.') {
				tile[y + 1][x] = 'o';
				count += move(x, y + 1);
			}
		}
		if (y - 1 >= 0) {
			if (tile[y - 1][x] == '.') {
				tile[y - 1][x] = 'o';
				count += move(x, y - 1);
			}
		}
		if (x + 1 < W) {
			if (tile[y][x + 1] == '.') {
				tile[y][x + 1] = 'o';
				count += move(x + 1, y);
			}
		}
		if (x - 1 >= 0) {
			if (tile[y][x - 1] == '.') {
				tile[y][x - 1] = 'o';
				count += move(x - 1, y);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String temp;
		int atX = 0, atY = 0;
		int num;
		Scanner s = new Scanner(System.in);

		while (true) {
			W = s.nextInt();
			H = s.nextInt();
			
			if(W==0 && H==0) break;

			tile = new char[H][W];

			for (int i = 0; i < H; i++) {
				temp = s.next();
				tile[i] = temp.toCharArray();

				for (int j = 0; j < W; j++) {
					if (tile[i][j] == '@') {
						atX = j;
						atY = i;
					}
				}
			}

			num = move(atX, atY);

			System.out.println(num);
		}
		s.close();
	}

}