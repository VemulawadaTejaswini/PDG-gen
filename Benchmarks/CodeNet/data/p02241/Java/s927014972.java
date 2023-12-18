import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Tree a = new Tree(n);

		for (int y = 0; y < n; y++)
			for (int x = 0; x < n; x++)
				a.setLeng(x, y, scan.nextInt());

		System.out.println(a.MinTree());

		scan.close();
		System.exit(0);
	}
}

class Tree {
	int[][] leng;
	int[] reach;

	public Tree(int n) {
		leng = new int[n][n];
		reach = new int[n];
		for (int i = 0; i < n; i++)
			reach[i] = -1;
	}

	public int MinTree() {
		int min = Integer.MAX_VALUE;
		int xx = 0, yy = 0;
		for (int x = 0; x < leng.length; x++)
			for (int y = x + 1; y < leng[x].length; y++)
				if (leng[x][y] !=-1 && leng[x][y] < min) {
					xx = x;
					yy = y;
					min = leng[x][y];
				}
		reach[xx] = 0;
		reach[yy] = min;
		for (int i = 2; i < reach.length; i++)
			nextMin();

		int total = 0;
		for (int i = 0; i < reach.length; i++)
			total += reach[i];
		return total;
	}

	private void nextMin() {
		int min = Integer.MAX_VALUE;
		int xx = 0, yy = 0;
		for (int x = 0; x < leng.length; x++) {
			if (reach[x] == -1)
				continue;
			for (int y = 0; y < leng[x].length; y++) {
				if (reach[y] != -1||leng[x][y]==-1)
					continue;
				if (leng[x][y] < min) {
					xx = x;
					yy = y;
					min = leng[x][y];
				}
			}
		}
		reach[yy] = min;
	}

	public void setLeng(int x, int y, int length) {
		leng[x][y] = length;
	}

}

