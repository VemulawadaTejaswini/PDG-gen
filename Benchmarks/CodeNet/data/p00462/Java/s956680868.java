
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] s;
	int n, m, d;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			d = sc.nextInt();
			if(d == 0) break;
			n = sc.nextInt();
			m = sc.nextInt();
			s = new int[n];
			s[0] = 0;
			for(int i=1;i<n;i++) 
				s[i] = Integer.parseInt(sc.next());
			
			sort(s);
//			debug(s);
			int sum = 0;
			for(int i=0;i<m;i++) {
				int to = Integer.parseInt(sc.next());
				int l = 0;
				int r = n-1;
				for(;l<=r;) {
					int c = (l+r) / 2;
					if( to < s[c] ) r=c-1;
					else if( to > s[c] ) l = c+1;
					else {
						l = r = c;
						break;
					}
				}
//				debug(l, r);
//				debug(to, l>=n? d: s[l], l>=n? abs(d-to): abs(to-s[l]), r<0? to:s[r], r<0? to:abs(to-s[r]));
				sum += min(l>=n? abs(d-to): abs(to-s[l]), r<0? to:abs(to-s[r]));
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}