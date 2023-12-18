
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( (n|m) == 0 ) break;
			Pair[] ps = new Pair[m];
			for(int i=0;i<m;i++) ps[i] = new Pair(i+1, 0);
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
				int a = sc.nextInt();
				ps[j].s += a;
			}
			sort(ps, new Comp());
			System.out.print(ps[0].f);
			for(int i=1;i<m;i++) System.out.print(" " + ps[i].f);
			System.out.println();
		}
	}
	
	class Comp implements Comparator<Pair> {

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO 自動生成されたメソッド・スタブ
			return o2.s - o1.s;
		}
		
	}
	
	class Pair {
		int f, s;
		Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}