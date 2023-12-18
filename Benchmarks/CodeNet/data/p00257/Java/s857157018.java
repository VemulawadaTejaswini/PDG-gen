import java.util.*;

public class Main {
	Scanner sc;
	
	int max;
	int n;
	int[] d;
	boolean[] done;
	boolean[] memo;
	boolean dfs(int depth) {
		if( depth >= n + 1 ) {
			return true;
		}
		if( done[depth] ) {
			return memo[depth];
		}
		done[depth] = true;
		memo[depth] = false;
		
		boolean flag = false;
		for( int i = 1; i <= max; ++i ) {
			int ni = Math.min(depth + i, n + 1);
			ni = Math.max(Math.min(ni + d[ni], n + 1), 0);
			
			flag |= dfs(ni);
		}
		
		memo[depth] = flag;
		return memo[depth];
	}
	
	void solve() {
		sc = new Scanner(System.in);
		
		while(true) {
			max = sc.nextInt();
			
			if( max == 0 ) break;
			
			n = sc.nextInt();
			d = new int[n + 2];
			
			d[0] = 0;
			for( int i = 1; i <= n; ++i ) {
				d[i] = sc.nextInt();
			}
			d[n+1] = 0;
			
			done = new boolean[n + 2];
			memo = new boolean[n + 2];
			
			boolean ans = dfs(0);
			for( int i = 1; i <= n; ++i ) {
				if(done[i]) {
					ans &= memo[i];
				}
			}
			System.out.println(ans ? "OK" : "NG");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void debug(Object... os) {
		System.out.println(Arrays.deepToString(os));
	}
}