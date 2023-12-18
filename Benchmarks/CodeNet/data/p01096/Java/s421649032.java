public class Main {

	private int[] d;
	private int n;
	
	private Pair[] scan() {
		java.util.Set<Pair> lis = new java.util.TreeSet<Pair>();
		
		for (int p = 0; p + 1 < n; ++p) {
			if (Math.abs(d[p + 1] - d[p]) <= 1)
				lis.add(new Pair(p, p + 1));
		}
		for (int l = 4; l <= n; l += 2) {
			for (int s = 0; s + l <= n; ++s) {
				final int e = s + l - 1;
				if (lis.contains(new Pair(s + 1, e - 1)) && Math.abs(d[e] - d[s]) <= 1) {
					lis.add(new Pair(s, e));
					continue ;
				}
				for (int j = s + 1; j + 1 < e; j += 2) {
					if (lis.contains(new Pair(s, j)) && lis.contains(new Pair(j + 1, e))) {
						lis.add(new Pair(s, e));
						break ;
					}
				}
			}
		}
		
		return lis.toArray(new Pair[lis.size()]);
	}
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		try (java.util.Scanner sc = new java.util.Scanner(in)) {
			for (;;) {
				n = sc.nextInt();
				if (n == 0) break ;
				d = new int[n];
				for (int i = 0; i < n; ++i)
					d[i] = sc.nextInt();
				
				Pair[] seq = scan();
				java.util.Arrays.sort(seq);
				
				int[] fullSize = new int[n + 1];
				for (int i = 0; i < seq.length; ++i) {
					final Pair p = seq[i];
					final int score = (p.u - 1 < 0 ? 0 : fullSize[p.u - 1]) + p.length;
					for (int j = p.v; j <= n; ++j) {
						if (score <= fullSize[j]) break ;
						fullSize[j] = score;
					}
				}
				out.println(fullSize[n]);
			}
		}
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

	private static class Pair implements Comparable<Pair> {
		public final int u;
		public final int v;
		public final int length;
		
		public Pair(int u, int v) {
			this.u = Math.min(u, v);
			this.v = Math.max(u, v);
			this.length = v - u + 1;
		}
		
		@Override
		public int compareTo(Pair o) {
			if (this.u < o.u) return -1;
			if (o.u < this.u) return 1;
			if (this.v < o.v) return -1;
			if (o.v < this.v) return 1;
			return 0;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + u;
			result = prime * result + v;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (u != other.u)
				return false;
			if (v != other.v)
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "(" + this.u + ", " + this.v + ")";
		}
	}
	
}