
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			int[][] map1 = new int[5][5];
			int s = sc.next().charAt(0) - 'A';
			int t = sc.next().charAt(0) - 'A';
			int b = sc.next().charAt(0) - 'A';
			int cnt;
			for(int[] a: map1) fill(a, -1);
			for(int i=1;i<=3;i++) for(int j=1;j<=3;j++) map1[i][j] = 0;
			map1[ b/3+1 ][ b%3+1 ] = -1;
			cnt = 1;
			map1[ s/3+1 ][ s%3+1 ] = 1;
//			for(int[] a: map1) debug(a);
			for(int c=0;c<n;c++) {
				int[][] tmp = new int[3][3];
				for(int x=1;x<=3;x++) for(int y=1;y<=3;y++)  {
					if(map1[x][y] == -1) {
						tmp[x-1][y-1] = map1[x][y];
						continue;
					}
					for(int j=0;j<4;j++) {
						if(map1[x+dx[j]][y+dy[j]] != -1) {
							tmp[x+dx[j]-1][y+dy[j]-1] += max(0, map1[x][y]);
						}
						else
							tmp[x-1][y-1] += max(0, map1[x][y]);
					}
				}
				for(int x=1;x<=3;x++) for(int y=1;y<=3;y++) {
					map1[x][y] = tmp[x-1][y-1];
				}
				cnt *= 4;
			}
			System.out.println(( (double)map1[t/3+1][t%3+1]/cnt ));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}