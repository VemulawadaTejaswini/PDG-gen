
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			long n = sc.nextLong();
			if(n == 0) break;
			long f = 5;
			long ans = 0;
			while(n>=f) { ans += n/f; f *= 5; }
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