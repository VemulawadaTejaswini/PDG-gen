import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w, h;
		while ((w = in.nextInt()) != 0 && (h = in.nextInt()) != 0) {
			int xs = in.nextInt();
			int ys = in.nextInt();
			int xg = in.nextInt();
			int yg = in.nextInt();
			char[][] b = new char[w + 1][h + 1];
			int n = in.nextInt();
			while (n-- > 0) {
				setBlock(b, in.next().charAt(0), in.nextInt(), in.nextInt(),
						in.nextInt());
			}
			String ans;
			if (b[xs][ys] == b[xg][yg] && b[xs][ys] != '0') {
				solid(b, b[xs][ys], xs, ys, xg, yg);
				ans = b[xs][ys] == b[xg][yg] ? "OK" : "NG";
			} else {
				ans = "NG";
			}
			System.out.println(ans);
		}

	}

	public static void setBlock(char[][] b, char c, int d, int x, int y) {
		b[x][y] = b[x + 1][y] = b[x][y + 1] = b[x + 1][y + 1] = c;
		if (d == -1) {
			return;
		} else if (d == 0) {
			setBlock(b, c, -1, x + 2, y);
		} else if (d == 1) {
			setBlock(b, c, -1, x, y + 2);
		}
	}

	public static void solid(char[][] b, char c, int x, int y, int xg, int yg) {
		if (b[x][y] == c) {
			b[x][y] = '*';
			if (x == xg && y == yg) {
				return;
			}
			solid(b, c, x + 1, y, xg, yg);
			solid(b, c, x - 1, y, xg, yg);
			solid(b, c, x, y + 1, xg, yg);
			solid(b, c, x, y - 1, xg, yg);
		}
	}
}