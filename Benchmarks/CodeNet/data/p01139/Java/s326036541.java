public class Main {

	private static void simulate(char[][] d) {
		java.util.Queue<Pair> lis = new java.util.LinkedList<Pair>();
		
		for (int i = 0; i < d.length; ++i) {
			for (int j = 0; j < d[i].length; ++j) {
				if (d[i][j] == 'B') {
					lis.add(new Pair(i, j - 1));
					lis.add(new Pair(i, j + 1));
					lis.add(new Pair(i - 1, j));
					lis.add(new Pair(i + 1, j));
				}
			}
		}
		while (!lis.isEmpty()) {
			final Pair p = lis.remove();
			final int i = p.i;
			final int j = p.j;
			if (i < 0 || i >= d.length) continue ;
			if (j < 0 || j >= d[i].length) continue ;
			if (d[i][j] == '.') {
				d[i][j] = 'b';
			} else continue ;
			lis.add(new Pair(i, j - 1));
			lis.add(new Pair(i, j + 1));
			lis.add(new Pair(i - 1, j));
			lis.add(new Pair(i + 1, j));
		}
		
		lis.clear();		
		for (int i = 0; i < d.length; ++i) {
			for (int j = 0; j < d[i].length; ++j) {
				if (d[i][j] == 'W') {
					lis.add(new Pair(i, j - 1));
					lis.add(new Pair(i, j + 1));
					lis.add(new Pair(i - 1, j));
					lis.add(new Pair(i + 1, j));
				}
			}
		}
		while (!lis.isEmpty()) {
			final Pair p = lis.remove();
			final int i = p.i;
			final int j = p.j;
			if (i < 0 || i >= d.length) continue ;
			if (j < 0 || j >= d[i].length) continue ;
			if (d[i][j] == '.') {
				d[i][j] = 'w';
			} else if (d[i][j] == 'b') {
				d[i][j] = 'g';
			} else continue ;
			lis.add(new Pair(i, j - 1));
			lis.add(new Pair(i, j + 1));
			lis.add(new Pair(i - 1, j));
			lis.add(new Pair(i + 1, j));
		}
	}
	
	private static int countif(char[][] d, char ch) {
		int rvalue = 0;
		for (int i = 0; i < d.length; ++i) {
			for (int j = 0; j < d[i].length; ++j) {
				if (d[i][j] == ch) {
					rvalue += 1;
				}
			}
		}
		return rvalue;
	}
	
	public static void main(String[] args) {
		try (final java.util.Scanner sc = new java.util.Scanner(System.in)) {
			for (;;) {
				final int w = sc.nextInt();
				final int h = sc.nextInt();
				if (w == 0 && h == 0) break ;
				final char[][] d = new char[h][];
				for (int i = 0; i < h; ++i) {
					d[i] = sc.next().toCharArray();
				}
				simulate(d);
				System.out.printf("%d %d\n", countif(d, 'b'), countif(d, 'w'));
			}
		}
	}

	private static class Pair {
		private int i;
		private int j;
		
		private Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}

}
