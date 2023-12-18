
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int cnt;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			boolean used[] = new boolean[10];
			fill(used, false);
			cnt = 0;
			serach(0,n,0,s,used);
			System.out.println(cnt);
		}
	}
	
	void serach(int i, int n, int s, int sum, boolean[] used) {
//		System.out.println(s + " " + sum);
		if( s > sum ) return;
		if( i == n ) {
			if( s == sum ) cnt++;
		}
		else {
			for(int j=0;j<10;j++) {
				if(!used[j]) {
					used[j] = true;
					serach(i+1, n, s+j*(i+1), sum, used);
					used[j] = false;
				}
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