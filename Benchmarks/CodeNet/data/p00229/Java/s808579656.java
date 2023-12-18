
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int b = sc.nextInt();
			int r = sc.nextInt();
			int g = sc.nextInt();
			int c = sc.nextInt();
			int s = sc.nextInt();
			int t = sc.nextInt();
			if((b|r|g|c|s) == 0) break;
			long cnt = 100;
			cnt += b*15 + 5*b*15;
			cnt += r*15 + 3*r*15;
			cnt += g*7;
			cnt += c*2;
			cnt += 3*s;
			cnt -= t*3;
			cnt += 5*b+3*r;
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