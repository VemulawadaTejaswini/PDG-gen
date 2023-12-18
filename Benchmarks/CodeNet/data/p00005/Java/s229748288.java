import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
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