
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	final int J = 10;
	int dp[][];
	int bv[][];
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] books = new LinkedList[J];
		for(int i=0;i<J;i++) books[i] = new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			int c = sc.nextInt();
			int g = sc.nextInt()-1;
			books[g].add(c);
		}
		bv = new int[J][];
		for(int i=0;i<J;i++) bv[i] = new int[books[i].size()+1];
		for(int i=0;i<J;i++) {
			Collections.sort(books[i]);
			int size = books[i].size();
			for(int j=1;j<=size;j++) {
//				debug(books[i]);
				bv[i][j] = books[i].removeLast() + bv[i][j-1];
			}
			for(int j=1;j<=size;j++) {
				bv[i][j] += j * (j-1);
			}
		}
		dp = new int[J][k+1];
		for(int[] a: dp) fill(a, -1);
		System.out.println(solve(0, k));
//		debug(bv);
//		for()
	}
	
	int solve(int j, int k) {
		if(j == 10) return 0;
		if(dp[j][k] >= 0) return dp[j][k];
		
		int ret = 0;
		int kk = min(k, bv[j].length-1);
		for(int i=0;i<=kk;i++) {
			ret = max(ret, bv[j][i] + solve(j+1, k-i));
		}
		
		return dp[j][k] = ret;
	}
	
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}