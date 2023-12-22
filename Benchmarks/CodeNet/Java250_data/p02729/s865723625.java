//--- pA ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	int[] fact;
	private void run_case() {
		int N = reader.ni(), M = reader.ni();

		fact = new int[101];
		fact[0] = 1;
		for (int i=1; i<101; i++) {
			fact[i] = fact[i-1] * i;
		}

		long res = nCr(N, 2) + nCr(M, 2);
		System.out.println(res);

		return;
	}

	private long nCr(int n, int r) {
		if (n < r) return 0;
	    // return fact[n] / fact[n - r] / fact[r];
		long res = 1;
		for (long i=n-r+1; i<=n; i++) {
			res *= i;
		}
		res /= 2;
		return res;
	}
	//
	// // Returns factorial of n
	// private int fact(int n) {
	//     int res = 1;
	//     for (int i = 2; i <= n; i++)
	//         res = res * i;
	//     return res;
	// }
}


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public String ns() {return this.next();}
}
