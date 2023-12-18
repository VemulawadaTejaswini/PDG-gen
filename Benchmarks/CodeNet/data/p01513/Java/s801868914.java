
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 100;
	boolean[][] map;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			map = new boolean[MAX][MAX];
			for(int i=0;i<n;i++) {
				int m = sc.nextInt();
				for(int j=0;j<m;j++) map[i][sc.nextInt()-1] = true;
			}
			int l = sc.nextInt();
			int[] pr = new int[l];
			for(int i=0;i<l;i++) pr[i] = sc.nextInt()-1;
			
			boolean ans = false;
			int tgt = -1;
			for(int i=0;i<n;i++) {
				boolean flg = true;
				for(int k=0;k<l;k++) {
					if(!map[i][pr[k]]) flg = false;
				}
				if( flg ) {
					if(!ans) {
						ans = true;
						tgt = i+1;
					}
					else {
						ans = false;
						break;
					}
				}
			}
			
			System.out.println( (ans? tgt: -1) );
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}