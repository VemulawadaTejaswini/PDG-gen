
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m, h, k;
	boolean[][] map;
	int score[];
	void run() {
		Scanner sc = new Scanner(System.in);

		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			h = sc.nextInt();
			k = sc.nextInt();
			if( (n|m|h|k) == 0 ) break;
			map = new boolean[n+1][h];
			score = new int[n];
			for(int i=0;i<n;i++) score[i] = sc.nextInt();
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b-1] = true;
			}
			int ret[] = new int[n];
			for(int i=0;i<n;i++) ret[i] = i+1;
			HashSet<Pair> rev = new HashSet<Pair>();
			for(int j=0;j<h;j++) for(int i=1;i<n;i++) {
				if(map[i][j]) {
					rev.add(new Pair(ret[i-1], ret[i]));
					swap(ret, i-1, i);
				}
			}
//			debug(ret);
//			for(Pair p: rev) debug(p.f, p.s);
			int min = 0;
			HashMap<Integer, Integer> link = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++) link.put(ret[i]-1, i);
			for(int i=0;i<k;i++) min += score[link.get(i)];
//			debug(min);
			int val = min;
			for(Pair p: rev) {
				if( ( p.f <= k && p.s <= k ) || ( k < p.f && k < p.s ) )
					continue;
//				debug(score[link.get(p.f-1)], score[link.get(p.s-1)], (p.f <= k)? -1:1 );
				min = min(min, val + ( score[link.get(p.f-1)]-score[link.get(p.s-1)] ) * ( (p.f <= k)? -1:1 ) );
			}
			System.out.println(min);
		}

	}
	void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	class Pair {
		int f, s;
		Pair (int f, int s) {
			this.f = f;
			this.s = s;
		}

		@Override
		public boolean equals(Object o) {
			if(o instanceof Pair) {
				Pair p = (Pair) o;
				return p.f == f && p.s == s;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}