import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		ReaderWriter r = new ReaderWriter();
		int n = r.rInt();		
		int[] array = r.rIntArray(n);
		String ans = "";
		ans += r.wArray(array);

		for(int i = 1; i < n; i++) {
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
			ans += r.wArray(array);
		}
		
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
		System.out.print(ans);
	}
}


