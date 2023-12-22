import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean isPrime(int n) {
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		ReaderWriter r = new ReaderWriter(); 	// Class to read/write input.
		String ans = "";			// Final answer to be printed.

		int n = r.rInt();		// Number of elements.
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(isPrime(r.rInt())) count++;
		}

		ans += count;

		// Outputs final answer.
		r.pAns(ans);
		r.out.close();
	}


}

class ReaderWriter {
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	public ReaderWriter() {
		// br = new BufferedReader(new FileReader("in.txt"));
		// out = new PrintWriter(new FileWriter("out.txt"));
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
	}

	String next() throws IOException  {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	long rLong() throws IOException  {
		return Long.parseLong(next());
	}

	int rInt() throws IOException  {
		return Integer.parseInt(next());
	}

	int[] rIntArray(int n) throws IOException  {
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) {
			ret[i] = rInt();
		}
		return ret;
	}

	double rDouble() throws IOException  {
		return Double.parseDouble(next());
	}

	char rChar() throws IOException  {
		return next().charAt(0);
	}

	String rLine() throws IOException  {
		return br.readLine().trim();
	}

	String wArray(int[] a) throws IOException {
		if(a == null || a.length == 0) {
			return "";
		}
		String ret = "" + a[0];
		for(int i = 1; i < a.length; i++) {
			ret = ret + " " + a[i];
		}
		ret = ret + "\n";
		return ret;
	}

	void pAns(String ans) {
	//	if(ans.charAt(ans.length()-1) == '\n')
	//		ans = ans.substring(0,ans.length()-1);
		System.out.println(ans);
	}
}


