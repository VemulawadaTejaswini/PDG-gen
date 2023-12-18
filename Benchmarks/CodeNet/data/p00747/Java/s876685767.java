public class Main {

	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		for (;;) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			if (w == 0 && h == 0) break ;
			final Cell[][] map = new Cell[w][h];
			for (int i = 0; i < w; ++i)
			for (int j = 0; j < h; ++j)
				map[i][j] = new Cell();
			for (int i = 1; i < w; ++i) {
				if (sc.nextInt() == 0) {
					map[i - 1][0].right = map[i][0];
					map[i][0].left = map[i - 1][0];
				}
			}
			for (int j = 1; j < h; ++j) {
				for (int i = 0; i < w; ++i) {
					if (sc.nextInt() == 0) {
						map[i][j].top = map[i][j - 1];
						map[i][j - 1].bottom = map[i][j];
					}
				}
				for (int i = 1; i < w; ++i) {
					if (sc.nextInt() == 0) {
						map[i - 1][j].right = map[i][j];
						map[i][j].left = map[i - 1][j];
					}
				}
			}
			
			java.util.Queue<Cell> lis = new java.util.LinkedList<Cell>();
			map[0][0].visited = 1;
			lis.add(map[0][0]);
			while (!lis.isEmpty()) {
				final Cell e = lis.remove();
				if (e == map[w - 1][h - 1])
					break ;
				if (e.top != null && e.top.visited == 0) {
					e.top.visited = e.visited + 1;
					lis.add(e.top);
				}
				if (e.left != null && e.left.visited == 0) {
					e.left.visited = e.visited + 1;
					lis.add(e.left);
				}
				if (e.right != null && e.right.visited == 0) {
					e.right.visited = e.visited + 1;
					lis.add(e.right);
				}
				if (e.bottom != null && e.bottom.visited == 0) {
					e.bottom.visited = e.visited + 1;
					lis.add(e.bottom);
				}
			}
			out.println(map[w - 1][h - 1].visited);
		}
	}
	
	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}

	private class Cell {
		public int visited;
		public Cell top, left, right, bottom;
		public Cell() {
			this.visited = 0;
			this.top = null;
			this.left = null;
			this.right = null;
			this.bottom = null;
		}
	}
	
}