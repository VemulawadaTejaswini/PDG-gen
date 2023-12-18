
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
			int m = sc.nextInt();
			String str = sc.next();
			int cnt = 0;
			int ioi = 0;
			for(int i=0;i<m;i++) {
				if( str.charAt(i) == 'I' ) {
					if( ioi%2 == 0 ) {
						ioi++;
						if( ioi/2 >= n  ) cnt++;
					}
					else ioi = 1;
				}
				else if( str.charAt(i) == 'O' ) {
					if( ioi%2 == 1 )
						ioi++;
					else ioi = 0;
				}
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}