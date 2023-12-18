
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next(), ans = "";
			for(int i=0;i<str.length();i++) {
				if( str.charAt(i) == '@' ) {
					i++; int n = str.charAt(i++) - '0';
					for(int j=0;j<n;j++) ans += str.charAt(i);
				} else {
					ans += str.charAt(i);
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}