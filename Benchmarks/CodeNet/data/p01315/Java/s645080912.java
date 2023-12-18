import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static class Plant implements Comparable<Plant> {
		String l;
		int p,t,f,s,m,a;
		public Plant(String l,int p, int t, int f, int s, int m, int a) {
			this.l = l;
			this.p = p;
			this.t = t;
			this.f = f;
			this.s = s;
			this.m = m;
			this.a = a;
		}
		public int compareTo(Plant o) {
			int e = (this.f * this.s * this.m - this.p) * (o.t + o.a + o.t * (o.m - 1)) - (o.f * o.s * o.m - o.p) * (this.t + this.a + this.t * (this.m - 1));
			if (e == 0)
				return this.l.compareTo(o.l);
			else if (e > 0)
				return -1;
			else
				return 1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0) break;
			Plant[] q = new Plant[n];
			for (int i = 0; i < n; i++) {
				String l = sc.next();
				int p = Integer.parseInt(sc.next());
				int a = Integer.parseInt(sc.next());
				int t = 0;
				for (int j = 0; j < 4; j++)
					t += Integer.parseInt(sc.next());
				int f = Integer.parseInt(sc.next());
				int s = Integer.parseInt(sc.next());
				int m = Integer.parseInt(sc.next());
				q[i] = new Plant(l, p, t, f, s, m, a);
			}
			Arrays.sort(q);
			for (int i = 0; i < n; i++) {
				System.out.println(q[i].l);
			}
			System.out.println("#");
		}
	}
}
