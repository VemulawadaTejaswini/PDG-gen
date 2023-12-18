
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int e = sc.nextInt();
			if (e == 0) break;
			int min = INF;
			for (int z=0;z<=(int)floor(pow(e, 1.0/3));z++) for (int y=0;y<=sqrt(e-z*z*z);y++) {
				int x = e - z*z*z - y*y;
				min = min(min, x+y+z);
//				debug(z, y, x);
			}
			System.out.println(min);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}