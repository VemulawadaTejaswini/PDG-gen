
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
//		for(;;) {
			int n = sc.nextInt();
			long ans[][] = new long[2][21];
			ans[0][0] = 1;
			for(int i=0;i<n-1;i++) {
				int val = sc.nextInt();
				fill(ans[i%2==0? 1:0],0);
				for(int j=0;j<=20;j++) {
					if(j+val<=20) ans[i%2==0?1:0][j+val] += ans[i%2==0?0:1][j];
					if(j-val>=0)  ans[i%2==0?1:0][j-val] += ans[i%2==0?0:1][j];
				}
//				debug(val);
//				debug(ans[i%2==0?1:0]);
			}
			System.out.println(ans[1-n%2][sc.nextInt()]);
//		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}