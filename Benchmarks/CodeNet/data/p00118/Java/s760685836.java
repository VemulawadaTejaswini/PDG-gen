import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		int tree[][];
		int area[][];

		while (true) {
			height = sc.nextInt();
			width = sc.nextInt();
			if ((height | width) == 0) {
				break;
			}
			tree = new int[height][width];
			area = new int[height][width];
			for (int i = 0; i < height; i++) {
				String s = sc.next();
				for (int j = 0; j < width; j++) {
					tree[i][j] = s.charAt(j);
				}
			}
			System.out.println(f(tree, area, height, width));
		}
	}
	
	public static int f(int tree[][], int area[][], int h, int w) {
		int count = 0;
		for (int i = 0; i < h; i ++) {
			for (int j = 0; j < w; j++) {
				if (area[i][j] == 0) {
					count++;
					g(tree, area, i, j, h, w, count);
				}
			}
		}
		return count;
	}
	
	public static void g(int tree[][], int area[][], int i, int j, int h, int w, int count) {
		if (area[i][j] != 0) {
			return ;
		}
		int x = tree[i][j];
		area[i][j] = count;
		if (0 <= i - 1 && tree[i - 1][j] == x) {
			g(tree, area, i - 1, j, h, w, count);
		}
		if (i + 1 < w && tree[i + 1][j] == x) {
			g(tree, area, i + 1, j, h, w, count);
		}
		if (0 <= j - 1 && tree[i][j - 1] == x) {
			g(tree, area, i, j - 1, h, w, count);
		}
		if (j + 1 < h && tree[i][j + 1] == x) {
			g(tree, area, i, j + 1, h, w, count);
		}
	}
}