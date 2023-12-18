
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 2 << 25;
	int n,k;
	int[][] map;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			k = sc.nextInt();
			if((n|k) == 0) break;
			map = new int[n][n];
			for(int[] a: map) fill(a, INF);
			for(int i=0;i<n;i++) map[i][i] = 0;
			boolean updated = false;
			for(int i=0;i<k;i++) {
				int f = sc.nextInt();
				if( f == 0 ) {
//					if( !updated ) wf(0,0);
					updated = true;
					int a = sc.nextInt()-1;
					int b = sc.nextInt()-1;
					if( map[a][b] == INF) System.out.println(-1);
					else System.out.println(map[a][b]);
				}
				else {
					int c = sc.nextInt()-1;
					int d = sc.nextInt()-1;
					int e = sc.nextInt();
					map[c][d] = map[d][c] = min(e, map[c][d]);
					wf(new int[] {c, d});
					updated = false;
				}
			}
		}
	}
	
	void wf(int a[]) {
		for (int k=0;k<a.length;k++) for(int i=0;i<n;i++) for(int j=0;j<n;j++){
			map[i][j] = min(map[i][j], map[i][a[k]] + map[a[k]][j]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}