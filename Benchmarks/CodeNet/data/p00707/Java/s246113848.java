
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	int cmp (String p1, String p2) {
		if( p1.length() != p2.length() ) return p2.length() - p1.length();
		return p2.compareTo(p1);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0 ) break;
			
			String[][] dp = new String[h+1][w+1];
			String pass = "";
			char[][] map = new char[h+1][w+1];
			
			for(String[] a: dp) fill(a, "");
			
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) {
					map[i][j] = str.charAt(j-1);
				}
			}
			
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				if( '0' <= map[i][j] && map[i][j] <= '9' ) {
					if( map[i][j] == '0' && dp[i-1][j].equals("") && dp[i][j-1].equals("") ) continue;
					dp[i][j] = ( cmp(dp[i-1][j], dp[i][j-1])<0? dp[i-1][j]: dp[i][j-1] ) + (char)map[i][j];
				}
				pass = cmp(pass, dp[i][j])<0? pass: dp[i][j];
			}
			
			System.out.println(pass);
			
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}