import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static char op[] = new char[200000];
	static int opI[] = new int[200000];
	static int opJ[] = new int[200000];
	static int opK[] = new int[200000];
	static int opCnt;

	static void add(int i, int j, int k) {
		op[opCnt] = '+';
		opI[opCnt] = i;
		opJ[opCnt] = j;
		opK[opCnt] = k;
		++opCnt;
	}

	static void less(int i, int j, int k) {
		op[opCnt] = '<';
		opI[opCnt] = i;
		opJ[opCnt] = j;
		opK[opCnt] = k;
		++opCnt;
	}

	static final int MAXPOW = 29;
	static int rA, rB, rZero, rOne, rAcc, rAcc2;

	static void solve() throws Exception {
		rA = 0;
		rB = 1;
		rZero = 2;
		rOne = 3;
		add(rA, rB, rOne);
		less(rZero, rOne, rOne);
		for (int i = 1; i <= MAXPOW; i++) {
			add(rOne + i - 1, rOne + i - 1, rOne + i);
		}
		int rFree = rOne + MAXPOW + 1;
		rAcc = rFree++;
		rAcc2 = rFree++;
		int powsA = rFree;
		toPows(rA, powsA);
		rFree += MAXPOW + 1;
		int powsB = rFree;
		toPows(rB, powsB);
		rFree += MAXPOW + 1;
		int rDest = 2;
		for (int i = 2 * MAXPOW; i >= 0; i--) {
			if (i != 2 * MAXPOW) {
				add(rDest, rDest, rDest);
			}
			for (int j = max(0, i - MAXPOW); j <= min(MAXPOW, i); j++) {
				add(powsA + j, powsB + i - j, rAcc2);
				less(rOne, rAcc2, rAcc2);
				add(rDest, rAcc2, rDest);
			}
		}
		out.println(opCnt);
		for (int i = 0; i < opCnt; i++) {
			out.println(op[i] + " " + opI[i] + " " + opJ[i] + " " + opK[i]);
		}
	}

	static void toPows(int rSrc, int rDest) {
		add(rOne, rSrc, rSrc);
		for (int i = MAXPOW; i >= 0; i--) {
			add(rAcc, rOne + i, rAcc2);
			less(rAcc2, rSrc, rDest + i);
			int cur = rDest + i;
			for (int j = 0; j < i; j++) {
				add(cur, cur, rAcc2);
				cur = rAcc2;
			}
			add(rAcc, cur, rAcc);
		}
		add(rZero, rZero, rAcc);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}