
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
//		for(;;) {
			int n = sc.nextInt();
//			if( n == 0 ) break;
			int cnt = 0, x = n;
			for(;x!=1;cnt++) x = (x/3)+(x%3==0? 0:1);
			System.out.println(cnt);
//		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}