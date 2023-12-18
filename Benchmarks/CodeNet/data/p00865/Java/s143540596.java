import java.util.*;
import java.lang.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main{
	int INF = 1 << 28;
	double EPS = 1e-9;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m =sc.nextInt(), k = sc.nextInt();
			if((n|m|k) == 0) break;
			long[][] pas = new long[2][n*m+1];
			pas[0][0] = 1;
			int x = 1;
			for(int i=0;i<n;i++) {
				fill(pas[x], 0);
				for(int j=0;j<=n*m;j++) if(pas[1-x][j] > 0) {
					for(int h=1;h<=m;h++) pas[x][j+h] += pas[1-x][j];
				}
				x = 1-x;
			}
//			debug(pas[1-x]);
			long sum = 0;
			for(int i=0;i<=m*n;i++) sum += pas[1-x][i];
			
//			debug(sum);
			double ex = 0.0;
			for(int i=0;i<=n*m;i++) ex += 1.0 * max(i-k, 1) * pas[1-x][i] / sum;
			
			System.out.println(ex);
		}
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args ) {
		new Main().run();
	}
	}

	