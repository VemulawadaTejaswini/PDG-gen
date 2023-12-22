import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Long> a = new ArrayList<Long>();
		ArrayList<Long> b = new ArrayList<Long>();
		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		double m = Math.sqrt(n);
		for (long i = 1; i <= m+1; i++) {
			if (n%i == 0) {
				a.add(i);
				b.add(n/i);
			}
		}
		for (int i = 0; i < a.size(); i++) {
			int ans = Fnum(a.get(i), b.get(i));
			if (ans < min) {
				min = ans;
			}
		}
		System.out.println(min);
	}

	public static int Fnum(long x, long y) {
		String s = String.valueOf(x);
		String t = String.valueOf(y);
		int A = s.length();
		int B = t.length();
		return Math.max(A, B);
	}
}
