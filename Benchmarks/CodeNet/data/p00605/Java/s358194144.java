
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ1019 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			if (N == 0 && K == 0)
				return;
			int[] S = new int[K];
			for (int i = 0; i < K; i++)
				S[i] = sc.nextInt();
			int[][] B = new int[N][K];
			for (int i = 0; i < N; i++)
				for (int j = 0; j < K; j++)
					B[i][j] = sc.nextInt();
			boolean f = true;
			int[] T = new int[K];
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < N; j++)
					T[i] += B[j][i];
				if(T[i] > S[i]) {
					f = false;
					break;
				}
			}
			System.out.println(f ? "Yes" : "No");
		}
	}

}


public class Main {
	public static void main(String... args) {
		new AOJ1019().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}