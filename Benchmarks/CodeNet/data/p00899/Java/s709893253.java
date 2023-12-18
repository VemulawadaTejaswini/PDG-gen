
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n;
	int[][] mat;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if(n == 0) break;
			
			ArrayList<String> strs = new ArrayList<String>();
			for(int i=0;i<n;i++) {
				String str = sc.next();
				boolean flg = true;
				for(Iterator<String> it=strs.iterator();it.hasNext();) {
					String tmp = (String)it.next();
					if(tmp.indexOf(str) >= 0) { flg = false; break; }
					if(str.indexOf(tmp) >= 0) it.remove();
				}
				if(flg) strs.add(str);
			}
			
			String[] words = strs.toArray(new String[]{});
			n = words.length;
			mat = new int[n][n];
			
			for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(i!=j) {
				int l1 = words[i].length(), l2 = words[j].length();
				for(int k=0;k<l1;k++) if(l1-k <= l2 && words[i].endsWith(words[j].substring(0, l1-k))) {
					mat[i][j] = l1-k;
					break;
				}
			}
//			debug(words);
//			debug(mat);
			int len = 0;
			for(String w: words) len += w.length();
			int max = 0;
			mem = new int[n][1<<n]; for(int[] a: mem) fill(a, -1);
			for(int i=0;i<n;i++) max = max(max, solve(i, 1<<i));
//			debug(len, max);
			System.out.println(len - max);
		}
	}
	
	int[][] mem;
	int solve(int p, int S) {
		if(mem[p][S] >= 0) return mem[p][S];
		int max = 0;
		
		for(int i=0;i<n;i++) if( ((S>>i)&1) == 0 ) {
			max = max(max, solve(i, S|(1<<i)) + mat[p][i]);
		}
		return mem[p][S] = max;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}