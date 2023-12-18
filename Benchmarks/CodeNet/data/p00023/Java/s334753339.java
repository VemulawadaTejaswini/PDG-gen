
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int c = 0; c < n; c++) {
			double x1 = sc.nextDouble(), y1 = sc.nextDouble(), r1 = sc.nextDouble();
			double x2 = sc.nextDouble(), y2 = sc.nextDouble(), r2 = sc.nextDouble();
			double dx = abs(x1 - x2), dy = abs(y1 - y2), rp = r1 + r2;
			if( dx * dx + dy * dy > rp * rp ) { System.out.println(0); continue; }
			if( sqrt( dx * dx + dy * dy ) + r1 < r2 )
			{ System.out.println(-2); continue; }
			if( sqrt( dx * dx + dy * dy ) + r2 < r1 )
			{ System.out.println(2); continue; }
			System.out.println(1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}