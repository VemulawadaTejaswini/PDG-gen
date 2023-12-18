//--- pB ---//
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
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		int n = reader.ni();
		long[] arr = new long[n];
		for (int i=0; i<n; i++) arr[i] = reader.nl();
		// Arrays.sort(arr);

		for (int i=0; i<n; i++) {
			if (arr[i] == 0) {
				out.println("0");
				return;
			}
		}

		long res = 1;
		long inf = (long)1e18;
		for (int i=0; i<n; i++) {
			long bound = inf / res;
			if (arr[i] > bound) {
				out.println("-1");
				return;
			}
			res *= arr[i];
		}

		out.println(res);
		return;
	}
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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
