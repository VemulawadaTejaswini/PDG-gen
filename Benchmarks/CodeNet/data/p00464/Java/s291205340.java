
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int h, w;
	int n;
	int[][] map;
	int[][] walk;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			if( (h|w|n) == 0 ) break;
			map = new int[h][w];
			walk = new int[h+1][w+1];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++){
				map[i][j] = sc.nextInt();
			}
			solve();
		}
	}
	
	void solve() {
		int px = 1, py = 1;
		walk[0][0] = n;
		for(int i=0;i<py;i++) for(int j=0;j<px;j++) {
			if((map[i][j]+walk[i][j])%2==0) px++;
			else          				  	py++;
			walk[i][j+1] += walk[i][j]/2 + (walk[i][j]%2) * map[i][j];
			walk[i+1][j] += walk[i][j]/2 + (walk[i][j]%2) * (1-map[i][j]);
			if( px == w+1 || py == h+1 ) {
				System.out.println((py) + " " + (px));
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