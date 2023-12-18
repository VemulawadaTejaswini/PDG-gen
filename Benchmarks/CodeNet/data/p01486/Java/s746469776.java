
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	String str;
	int p;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		cat();
		System.out.println( (p == str.length()? "YES": "NO" ) );
	}
	
	void cat() {
		if(str.charAt(p) != 'm') {
			return;
		}
		p++;
		cat();
		if(str.charAt(p) != 'e') {
			return;
		}
		p++;
		cat();
		if(str.charAt(p) != 'w') {
			return;
		}
		p++;
		return;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}