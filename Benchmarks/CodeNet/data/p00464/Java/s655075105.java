
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int h, w;
	long n;
	boolean[][] map;
	long[][] walk;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextLong();
			if( (h|w|n) == 0 ) break;
			map = new boolean[h][w];
			walk = new long[h+1][w+1];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++){
				map[i][j] = sc.nextInt() == 1;
			}
			solve();
		}
	}
	
	void solve() {
		int px = 0, py = 0;
		walk[0][0] = n;
		for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
			if(map[i][j]^walk[i][j]%2==0) px++;
			else          				  py++;
			walk[i][j+1] += walk[i][j]/2 + (walk[i][j]%2) * (map[i][j]? 1:0);
			walk[i+1][j] += walk[i][j]/2 + (walk[i][j]%2) * (map[i][j]? 0:1);
			if( px == w || py == h ) {
				System.out.println((py+1) + " " + (px+1));
				return;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}