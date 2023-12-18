import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static Queue<Pair> queue = new LinkedList<Pair>();

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		int area[][];
		int tree[][];

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
					area[i][j] = 0;
				}
			}
			System.out.println(f(tree, area, height, width));
		}
	}

	public static int f(int tree[][], int area[][], int h, int w) {
		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (area[i][j] == 0) {
					count++;
					g(tree, area, i, j, h, w, count);
					h(tree, area, i, j, h, w, count);
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
			Pair p = new Pair(i - 1, j);
			queue.add(p);
		}
		if (i + 1 < h && tree[i + 1][j] == x) {
			Pair p = new Pair(i + 1, j);
			queue.add(p);
		}
		if (0 <= j - 1 && tree[i][j - 1] == x) {
			Pair p = new Pair(i, j - 1);
			queue.add(p);
		}
		if (j + 1 < w && tree[i][j + 1] == x) {
			Pair p = new Pair(i, j + 1);
			queue.add(p);
		}
	}
	
	public static void h(int tree[][], int area[][], int i, int j, int h, int w, int count) {
		while (!queue.isEmpty()) {
			Pair p = queue.poll();
			g(tree, area, p.x, p.y, h, w, count);
		}
	}
}