
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
		int n =sc.nextInt();
		double x = 0;
		for(int i=0;i<n;i++) {
			int op = sc.nextInt(), y = sc.nextInt();
			if( op==1 ) x += y;
			if( op==2 ) x -= y;
			if( op==3 ) x *= y;
			if( op==4 ) x /= y;
		}
		System.out.println((int)x);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}