import java.util.*;

public class Main {
	Coin[] coins;
	Scanner sc = new Scanner(System.in);
	boolean[] lapped;
	int n;
	int[] state;
	
	void run() {
		while (true) {
			n = sc.nextInt();
			if( n == 0 ) break;
			coins = new Coin[n];
			lapped = new boolean[n];
			for(int i=0;i<n;i++) coins[i] = new Coin();
			int S=(1<<n)-1;
			state = new int[1<<n];
			for(int i=0;i<(1<<n);i++) state[i] = -1;
			System.out.println(solve(S));
		}
	}
	
	int solve( int S ) {
//		System.out.println(S);
		if (state[S] >= 0) return state[S];
		analyseLapped(S);
//		for(int i=0;i<n;i++) System.out.print(lapped[i] + " ");
//		System.out.println();
//		sc.next();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if( lapped[i] ) continue;
			for(int j=i+1;j<n;j++) {
				if ( !lapped[j] && coins[i].c == coins[j].c ) {
					cnt = Math.max(cnt, solve(S-((1<<i) + (1<<j)))+2);
				}
			}
		}
		return state[S] = cnt;
	}
	
	void analyseLapped(int S) {
		for(int i=0;i<n;i++) lapped[i] = false;
		for(int i=0;i<n;i++) {
//			System.out.println( (S>>i) & 1 );
			if( ((S>>i) & 1) != 1 ) { lapped[i] = true ; continue; }
			for(int j=i+1;j<n;j++) {
				if( ((S>>j) & 1) != 1 ) { lapped[j] = true; continue; }
//				System.out.println(coins[i].isLapped(coins[j]));
				if( coins[i].isLapped(coins[j]) ) lapped[j] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	protected class Coin {
		int x, y, r, c;
		
		public Coin() {
			scan();
		}
		
		void scan() {
			x = sc.nextInt();
			y = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
		}
		
		boolean isLapped( Coin c ) {
			return (c.x-x)*(c.x-x)+(c.y-y)*(c.y-y) < (r+c.r)*(r+c.r);
		}
	}
}