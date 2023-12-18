
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = Integer.MAX_VALUE;
	Stone[][] stones;
	int n;
	int m;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n= sc.nextInt();
			m =sc.nextInt();
			if( (n|m) == 0 ) break;
			stones = new Stone[n][];
			for(int i=0;i<n;i++) {
				int k = sc.nextInt();
				stones[i] = new Stone[k];
				for(int j=0;j<k;j++) {
					int x = sc.nextInt();
					int d = sc.nextInt();
					stones[i][j] = new Stone(x, d);
				}
			}
			for(int i=0;i<stones[0].length;i++) stones[0][i].min[0] = 0;
			for(int i=1;i<n;i++) {
				for(int j=0;j<stones[i].length;j++) {
					for(int k=0;k<=m;k++) for(int l=0;l<stones[i-1].length;l++){
						stones[i][j].min[k] = min( stones[i][j].min[k], stones[i-1][l].min[k] 
						                      + abs( stones[i][j].p - stones[i-1][l].p)
						                      * ( stones[i][j].d + stones[i-1][l].d ) );
					}
					if( i==1 ) {
						debug(stones[i][j].min);
						break;
					}
					for(int k=1;k<=m;k++) for(int l=0;l<stones[i-2].length;l++){
						stones[i][j].min[k] = min( stones[i][j].min[k], stones[i-2][l].min[k-1] 
						                           + abs( stones[i][j].p - stones[i-2][l].p)
						                    	   * ( stones[i][j].d + stones[i-2][l].d ) );
					}
					debug(stones[i][j].min);
				}
			}
			int min = INF;
			for(int j=0;j<stones[n-1].length;j++) for(int i=0;i<=m;i++) {
				min = min(min, stones[n-1][j].min[i]);
			}
			System.out.println(min);
		}
	}
	
	class Stone {
		int p;
		int d;
		int[] min;
		Stone(int p, int d) {
			this.p = p;
			this.d = d;
			min = new int[m+1];
			fill(min, INF);
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}