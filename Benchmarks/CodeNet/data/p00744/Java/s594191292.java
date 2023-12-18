
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int m, n;
	boolean map[][];
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			m = sc.nextInt();
			n = sc.nextInt();
			if( (n|m) == 0 ) break;
			int[] b = new int[m];
			int[] r = new int[n];
			for(int i=0;i<m;i++) b[i] = sc.nextInt();
			for(int j=0;j<n;j++) r[j] = sc.nextInt();
			map = new boolean[m][n];
			for(int i=0;i<m;i++) for(int j=0;j<n;j++) {
				map[i][j] = gcd( b[i], r[j] );
			}
			System.out.println(matching());
		}
	}
	
	boolean augument(int u, int[] matchTo, boolean[] visited) {
		if( u < 0 ) return true;
		for(int i=0;i<n;i++) {
			if(map[u][i] & !visited[i]) {
				visited[i] = true;
				if( augument(matchTo[i], matchTo, visited) ) {
					matchTo[i] = u;
					return true;
				}
			}
		}
		
		return false;
	}
	
	int matching() {
		int[] matchTo = new int[n];
		fill(matchTo, -1);
		int match = 0;
		for(int i=0;i<m;i++) {
			boolean[] visited = new boolean[n];
			if(augument(i, matchTo, visited)) match++;
		}
		
		return match;
	}
	
	boolean gcd(int x, int y) {
		if(y==0) {
			return x != 1;
		}
		else return gcd(y, x%y);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}