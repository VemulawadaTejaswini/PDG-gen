
import java.util.*;
import java.io.*;
import java.math.BigInteger;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MAX = (int)1e7 * 2;
	int[] num;
	boolean[] p;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger v = BigInteger.ONE;
		for(int i=2;i<=n+1;i++) v = v.multiply(BigInteger.valueOf(i));
		System.out.println(v.add(BigInteger.valueOf(2)));
		for(int i=2;i<=n+1;i++) System.out.println(i);
	}
	

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}