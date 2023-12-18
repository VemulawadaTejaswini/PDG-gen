import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		String str = "abcdefghijklmnopqrstuvwxyz";
		long n = sc.nextLong();
		String ans = "";
		if (n <= 26) {
			System.out.println(str.charAt((int)n - 1));
			return;
		}
		while (n > 0) {
			long tmp = n % 26;
			if (tmp > 0)
				ans = ans + str.charAt((int)tmp - 1);
			if (tmp == 0)
				ans = ans + str.charAt(25);
			n = n - tmp;
			n = n / 26;
			if (tmp == 0)
				n--;


		}
		System.out.println(new StringBuilder(ans).reverse());

	}

}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}