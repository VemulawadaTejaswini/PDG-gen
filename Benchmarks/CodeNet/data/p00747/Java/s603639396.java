public class Main {

	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		for (;;) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			if (w == 0 && h == 0) break ;
			
			final Vertex[][] m = new Vertex[w][h];
			for (int i = 0; i < w; ++i)
			for (int j = 0; j < h; ++j) {
				m[i][j] = new Vertex();
			}
			for (int i = 1; i < w; ++i) {
				if (sc.nextInt() == 0) {
					m[i-1][0].neighbor.add(m[i][0]);
					m[i][0].neighbor.add(m[i-1][0]);
				}
			}
			for (int j = 1; j < h; ++j) {
				for (int i = 0; i < w; ++i) {
					if (sc.nextInt() == 0) {
						m[i][j-1].neighbor.add(m[i][j]);
						m[i][j].neighbor.add(m[i][j-1]);
					}
				}
				for (int i = 1; i < w; ++i) {
					if (sc.nextInt() == 0) {
						m[i-1][j].neighbor.add(m[i][j]);
						m[i][j].neighbor.add(m[i-1][j]);
					}
				}
			}
			
			java.util.Queue<Vertex> lis = new java.util.LinkedList<Vertex>();
			m[0][0].visited = 1;
			lis.add(m[0][0]);
			while (!lis.isEmpty()) {
				final Vertex e = lis.remove();
				for (java.util.Iterator<Vertex> it = e.neighbor.iterator(); it.hasNext(); ) {
					final Vertex n = it.next();
					if (n.visited == 0) {
						n.visited = e.visited + 1;
						lis.add(n);
					}
				}
			}
			
			out.println(m[w - 1][h - 1].visited);
		}
	}
	
	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}
	
	private static class Vertex {
		public java.util.List<Vertex> neighbor;
		public int visited;
		public Vertex() {
			this.neighbor = new java.util.LinkedList<Vertex>();
			this.visited = 0;
		}
	}

}