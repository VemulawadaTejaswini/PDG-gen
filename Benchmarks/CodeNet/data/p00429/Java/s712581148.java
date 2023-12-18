
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

			for(int i=0;i<n;i++) {
				int num = -1;
				int cnt = 0;
				String next = "";
				for(int j=0;j<str.length();j++) {
					if( num != str.charAt(j) - '0' ) {
						if ( num != -1 ) {
							next += cnt;
							next += num;
						}
						num = str.charAt(j) - '0';
						cnt = 1;
					}
					else {
						cnt++;
					}
				}
				next += cnt;
				next += num;
//				debug(next);
				str = next;
			}
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}