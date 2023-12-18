
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			Ctt[] ctts = new Ctt[n];
			for(int i=0;i<n;i++) {
				ctts[i] = new Ctt(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			sort(ctts, new Comp());
			int uni[] = new int[1000];
			int cnt=0;
			for(int i=0;i<n;i++) {
				if(cnt<10 && uni[ctts[i].u-1] < 3) {
					cnt++;
					System.out.println(ctts[i].i);
					uni[ctts[i].u-1]++;
				}
				else if(cnt<20 && uni[ctts[i].u-1] < 2) {
					cnt++;
					System.out.println(ctts[i].i);
					uni[ctts[i].u-1]++;
				}
				else if(cnt<26 && uni[ctts[i].u-1]<1) {
					cnt++;
					System.out.println(ctts[i].i);
					uni[ctts[i].u-1]++;
				}
				if(cnt==26) break;
			}
			
		}
	}
	
	class Comp implements Comparator<Ctt> {

		@Override
		public int compare(Ctt o1, Ctt o2) {
			// TODO 自動生成されたメソッド・スタブ
			if(o1.a < o2.a) return 1;
			else if( o1.a > o2.a) return -1;
			else {
				if(o1.p > o2.p) return 1;
				else if(o1.p < o2.p) return -1;
				else {
					return o1.i - o2.i;
				}
			}
		}
		
	}
	
	class Ctt {
		int i, u, a, p;
		Ctt (int i, int u, int a, int p){
			this.i = i;
			this.u = u;
			this.a = a;
			this.p = p;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}