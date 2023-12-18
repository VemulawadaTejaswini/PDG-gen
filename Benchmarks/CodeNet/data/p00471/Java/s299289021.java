
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m;
	int[][] map;
//	int[][] mem;
	int size;
	int sg;
	int[] nodes;
	HashMap<Integer, Integer> node_ind;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			m = sc.nextInt();
			n = sc.nextInt();
			if( (m|n) == 0 ) break;
			map = new int[n][m];
			size = 0;
			node_ind = new HashMap<Integer, Integer>();
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
				map[i][j] = sc.nextInt();
				if( map[i][j] == 1 ) {
					node_ind.put(p2int(j, i), size);
					tmp.add(p2int(j, i));
					size++;
				}
				if( map[i][j] == 2 ) sg = p2int(j, i);
			}
			
			nodes = new int[size+1];
			for(int i=0;i<size;i++) nodes[i] = tmp.removeFirst();
			nodes[size] = sg;
//			mem = new int[size+1][1<<size];
//			for(int[] a: mem) fill(a, -1);
			
//			debug(nodes);
//			debug(size, sg);
			System.out.println(solve(size, (1<<size)-1));
			
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int solve(int i, int S) {
//		debug(i, S);
//		if( mem[i][S] >= 0 ) return mem[i][S];
		
		int[] p = int2p(nodes[i]);
		
		if( S == 0 ) {
			for(int j=0;j<4;j++) for(int k=1;;k++) {
				if(!allow(p[0]+dx[j]*k, p[1]+dy[j]*k)) {
					break;
				}
				if(map[p[1]+dy[j]*k][p[0]+dx[j]*k] == 3)
					break;
				if(map[p[1]+dy[j]*k][p[0]+dx[j]*k] == 2)
					return 1;
			}
			return 0;
		}
		int cnt = 0;
		
		for(int j=0;j<4;j++) for(int k=1;;k++) {
			if(!allow(p[0]+dx[j]*k, p[1]+dy[j]*k)) {
				break;
			}
			if(map[p[1]+dy[j]*k][p[0]+dx[j]*k] == 3)
				break;
			if(map[p[1]+dy[j]*k][p[0]+dx[j]*k] == 1) {
				int pp = p2int( p[0]+dx[j]*k, p[1]+dy[j]*k );
				int ind = node_ind.get(pp);
				map[p[1]+dy[j]*k][p[0]+dx[j]*k] = 3;
				cnt += solve(ind, S - (1<<ind));
				map[p[1]+dy[j]*k][p[0]+dx[j]*k] = 1;
			}
		}
		
		return /*mem[i][S] =*/ cnt;
	}
	
	int p2int(int x, int y) {
		return x*100 + y;
	}
	int[] int2p(int val) {
		int[] p = new int[2];
		p[0] = val/100;
		p[1] = val-p[0]*100;
		return p;
	}
	
	boolean allow(int x, int y) {
		return !( x<0 || y<0 || x>=m || y>= n );
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}