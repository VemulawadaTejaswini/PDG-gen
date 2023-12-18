
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( (n|m) == 0 ) break;
			
			int map[] = new int[n];
			int sai[] = new int[m];
			
			for(int i=0;i<n;i++) map[i] = sc.nextInt();
			for(int i=0;i<m;i++) sai[i] = sc.nextInt();
			int cnt, p = 0;
			for(cnt=0;cnt<m;cnt++) {
				debug(p, sai[cnt] + p);
				if( sai[cnt] + p >= n-1 ) break;
//				debug( sai[cnt], map[sai[cnt] + p] );
				p += sai[cnt] + map[ sai[cnt] + p ];
				if( p >= n-1 ) {
					break;
				}
			}
			if( cnt == m ) cnt--;
			System.out.println(cnt+1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}