
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int r, c;
	boolean[][] map;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			r = sc.nextInt();
			c = sc.nextInt();
			if((r|c) == 0) break;
			map = new boolean[r][c];
			for(int i=0;i<r;i++) for(int j=0;j<c;j++) {
				map[i][j] = sc.nextInt() == 1;
			}
			int max = 0;
			for(int i=1; i<1<<r;i++) {
				boolean[][] tmp = new boolean[r][c];
				for(int j=0;j<r;j++) for(int k=0;k<c;k++)
					tmp[j][k] = map[j][k];
				for(int j=0;j<r;j++) if( ((i>>j) & 1) == 1 ) {
					for(int k=0;k<c;k++) tmp[j][k] ^= true;
				}
				int sum=0;
				for(int j=0;j<c;j++) {
					int cnt = 0;
					for(int k=0;k<r;k++) if(tmp[k][j])
						cnt++;
					sum += max(cnt, r-cnt);
				}
				max = max(max, sum);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}