
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] costs;
	long[] enemies;
	int n;
	int max;
	HashMap<String, Integer> name2int;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			costs = new int[n];
			enemies = new long[n];
			name2int = new HashMap<String, Integer>();
			String[][] names = new String[n][];
			for(int i=0;i<n;i++) {
				String name = sc.next();
				name2int.put(name, i);
				costs[i] = sc.nextInt();
				int m = sc.nextInt();
				names[i] = new String[m];
				for(int j=0;j<m;j++) {
					names[i][j] = sc.next();
				}
			}
			
			for(int i=0;i<n;i++) for(int j=0;j<names[i].length;j++){
				enemies[i] |= 1L<<name2int.get(names[i][j]);
			}
			for(int i=0;i<n;i++) enemies[i] |= 1L<<i;
			max = 0;
			dfs(1, enemies[0], costs[0]);
			System.out.println(max);
		}
	}
	
	void dfs(int x, long enemy, int cost) {
		if( x == n ) {
			max = max(max, cost);
			return;
		}
		if( ((enemy>>x)&1) == 1 ) {
			dfs(x+1, enemy, cost);
			return;
		}
		if( notConnected(x) ) {
			dfs(x+1, enemy|enemies[x], cost+costs[x]);
			return;
		}

		dfs(x+1, enemy, cost);
		dfs(x+1, enemy|enemies[x], cost+costs[x]);
	}
	
	boolean notConnected(int x) {
//		for(int i=0;i<n;i++) if( ((a>>i)&(b>>i)) == 1 ) return false;
		long mask = 0;
		for(int i=x+1;i<n;i++) mask |= enemies[i];
		
		return ((mask>>x)&1) == 0;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}