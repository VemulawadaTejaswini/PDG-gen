
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) sb.append(sc.nextInt());
			debug(sb);
			int min = n;
			for(int i=0;i<n;i++) for(int c=1;c<=3;c++){
				StringBuilder tmp = new StringBuilder(sb.substring(0, i) + c + sb.substring(i+1));
				LinkedList<P> stack = new LinkedList<P>();
				stack.add(new P(0, 0));
				debug(tmp);
				for(int j=0;j<n;j++) {
					int k = j;
					while(k<n && tmp.charAt(j) == tmp.charAt(k)) k++;
					
					P past = stack.removeLast();
					if( past.c == tmp.charAt(j)-'0' && past.t + k-j >= 4 );
					else { 
						stack.addLast(past); 
						if( k-j<=3 )
							stack.addLast(new P(tmp.charAt(j)-'0', k-j));
					}
					j = k-1;
				}
				for (P p : stack) debug(p.c, p.t);
				int sum = 0;
				for (P p : stack) sum += p.t;
				min = min(sum, min);
			}
			
			System.out.println(min);
		}
	}
	
	class P {
		int c, t;
		P(int c, int t) {
			this.c = c;
			this.t = t;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}