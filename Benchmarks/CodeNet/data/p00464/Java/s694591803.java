
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			if( (h|w|n) == 0 ) break;
			boolean[][] map = new boolean[h][w];
			for(int i=0;i<h;i++) for(int j=0;j<w;j++){
				map[i][j] = sc.nextInt() == 1;
			}
			int i=0,j=0;
			for(int k=0;k<n;k++) {
				i = j = 0;
				for(;i!=h&&j!=w;) {
					map[i][j] ^= map[i][j];
					if(map[i][j])	i++;
					else 			j++;
				}
			}
			System.out.println( (i+1) + " " + (j+1) );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}