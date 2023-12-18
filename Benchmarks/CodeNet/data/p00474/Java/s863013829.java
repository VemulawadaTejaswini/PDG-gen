
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] icecle;
	P[] pair;
	int[] mem;
	int n, l;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		mem = new int[n+2];
		icecle = new int[n+2];
		pair = new P[n+2];
		pair[0] = new P(0, INF);
		pair[n+1] = new P(0, INF);
		fill(mem, 0);
		for(int i=1;i<=n;i++) {
			icecle[i] = sc.nextInt();
			pair[i] = new P(i, icecle[i]);
		}
		sort(pair, new MyComp());
		long max = 0;
		mem[n+1] = 0;
		mem[0] = 0;
		for(int i=0;i<n;i++) {
//			debug(pair[i].x);
			mem[pair[i].x] = max(mem[pair[i].x-1], mem[pair[i].x+1]) + time(pair[i].x);
			max = max( max, mem[pair[i].x] );
		}
		System.out.println(max);
	}
	
	int time(int x) {
		return  l - icecle[x] ;
	}
	class MyComp implements Comparator<P> {

		@Override
		public int compare(P o1, P o2) {
			// TODO 自動生成されたメソッド・スタブ
			return o1.y -o2.y;
		}
		
	}
	
	class P {
		int x, y;
		P (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}