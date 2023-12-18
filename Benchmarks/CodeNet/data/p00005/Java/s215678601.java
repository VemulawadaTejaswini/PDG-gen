import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() throws IOException {
		String str;
		while ((str = br.readLine()) != null) {
			String[] strs = str.split(" ");
			long a = Long.parseLong(strs[0]);
			long b = Long.parseLong(strs[1]);
			long A = max(a, b);
			long B = min(a, b);
			long ans1 = 1, ans2 = 1;
			long rr = A - B;
			A = max(B, rr);
			B = min(B, rr);
			long r = A - B;
			while (r > 0) {
				rr = r;
				A = max(B, rr);
				B = min(B, rr);
				r = A - B;
			}
			ans1 = rr;
			ans2 = (a * b) / ans1;

			out.println(ans1 + " " + ans2);
			out.flush();
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}

	static long max(long a, long b) {
		return a < b ? b : a;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static long abs(long a) {
		return a < 0 ? -a : a;
	}

}