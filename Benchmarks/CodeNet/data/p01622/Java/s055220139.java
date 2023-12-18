
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			int[] r = new int[n], w = new int[n];
			int max = 0, p=0, sumr = 0, sumw = 0;
			for(int i=0;i<n;i++){ 
				r[i] = sc.nextInt(); 
				w[i] = sc.nextInt();
				if( r[i] > max ) {
					max = r[i]; p = i;
				}
				sumr += r[i];
				sumw += w[i];
			}
			
			if( sumr - max >= max ) {
				System.out.println((sumr + sumw));
			}
			else {
				boolean[] dp = new boolean[2 * max - sumr + 1];
				dp[0] = true;
				for(int i=0;i<n;i++) if(i != p) 
					for(int j = 2 * max - sumr;j>=w[i];j--)	dp[j] |= dp[j-w[i]];
				for(p = 2 * max - sumr;!dp[p];p--);
				System.out.println((2 * max + sumw - p));
			}
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}