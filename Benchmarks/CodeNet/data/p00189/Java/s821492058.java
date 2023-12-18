
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n==0) break;
			int maxn = 0;
			int map[][] = new int[10][10];
			for(int[] a: map) fill(a, INF);
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				maxn = max(maxn, max(a,b));
				map[a][b] = map[b][a] = c;
			}
			maxn++;
			for(int i=0;i<maxn;i++) map[i][i] = 0;
			for(int k=0;k<maxn;k++) for(int i=0;i<maxn;i++) for(int j=0;j<maxn;j++) {
				map[i][j] = min(map[i][j], map[i][k] + map[k][j]);
			}
//			for(int[] a: map) debug(a);
			
			int node = -1;
			int min = INF;
			for(int i=0;i<maxn;i++) {
				int sum = 0;
				for(int j=0;j<maxn;j++) sum += map[i][j];
				if(min > sum) {
					node = i;
					min = sum;
				}
			}
			System.out.println(node + " " + min);
			
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}