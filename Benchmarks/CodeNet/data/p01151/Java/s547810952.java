
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ2025 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N == 0)
				return;
			int[] num = new int[14];
			for (int i = 0; i < N; i++)
				num[sc.nextInt()]++;
			sb = new StringBuilder();
			limit = System.currentTimeMillis() + 3000;
			set = new HashSet<Long>();
			System.out.println(dfs(N, 0, num) ? sb : "No");
		}
	}

	StringBuilder sb;
	Set<Long> set;
	long limit;

	boolean dfs(int N, int sum, int[] num) {
		if (N == 0)
			return true;
		if(System.currentTimeMillis() > limit)
			return false;
		long hash = hash(sum, num);
		if (set.contains(hash))
			return false;
		set.add(hash);
		for (int i = 1; i <= 13; i++)
			if (num[i] > 0 && sum % i == 0) {
				num[i]--;
				if (dfs(N - 1, sum + i, num)) {
					sb.insert(0, i + " ");
					return true;
				}
				num[i]++;
			}
		return false;
	}

	long hash(int sum, int[] num) {
		long l = sum;
		for (int i = 1; i <= 13; i++)
			l = l * 5 + num[i];
		return l;
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ2025().run();
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