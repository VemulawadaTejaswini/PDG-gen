public class Main {

	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final RankInADynamicSubset lis = new RankInADynamicSubset(sc.nextInt());
		final int q = sc.nextInt();
		
		for (int i = 0; i < q; ++i) {
			final int com = sc.nextInt();
			final int x = sc.nextInt();
			final int y = sc.nextInt();
			
			if (com == 0) {
				lis.add(x, y);
			} else if (com == 1) {
				out.println(lis.currentRankOf(x, y));
			}
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

	private static class RankInADynamicSubset {
		private int[] d;
		private int   n;
		
		public RankInADynamicSubset(int n) {
			this.n = 1;
			while (this.n < n) {
				this.n *= 2;
			}
			d = new int[this.n * 2];
			java.util.Arrays.fill(d, 2147483647);
		}
		
		public void add(int i, int x) {
			i = n + i;
			d[i] = x;
			while (i != 1) {
				i /= 2;
				d[i] = Math.min(d[i * 2], d[i * 2 + 1]);
			}
		}
		
		public int currentRankOf(int s, int t) {
			return currentRankOf(s, t, 0, n - 1, 1);
		}
		
		private int currentRankOf(int s, int t, int lb, int ub, int i) {
			final int m = (lb + ub) / 2;
			int res;
			
			if (s <= lb && ub <= t) {
				return (d[i]);
			}
			
			res = Integer.MAX_VALUE;
			if (s <= m) {
				res = Math.min(res, currentRankOf(s, t, lb, m, i * 2));
			}
			if (m + 1 <= t) {
				res = Math.min(res, currentRankOf(s, t, m + 1, ub, i * 2 + 1));
			}
			
			return (res);
		}
	}
	
}