
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int t = - ( sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt() );
			t += sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
			int s = t % 60;
			int m = (t/60) % 60;
			int h = t/3600;
			System.out.println(h + " " + m + " " + s);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}