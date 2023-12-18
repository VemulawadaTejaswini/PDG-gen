
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0) break;
			String str = sc.next();
			StringBuilder s = new StringBuilder(str);
			
			for(int i=0;i<n;i++) {
				int num = -1;
				int cnt = 0;
				StringBuilder next = new StringBuilder();
				debug(s, s.length());
				for(int j=0;j<s.length();j++) {
					debug(s.charAt(j)-'0', num, cnt);
					if( num != s.charAt(j) - '0' ) {
						if ( num != -1 ) {
							next.append(cnt);
							next.append(num);
						}
						num = s.charAt(j) - '0';
						cnt = 1;
					}
					else {
						cnt++;
					}
				}
				next.append(cnt);
				next.append(num);
				debug(next);
				s = new StringBuilder(next);
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}