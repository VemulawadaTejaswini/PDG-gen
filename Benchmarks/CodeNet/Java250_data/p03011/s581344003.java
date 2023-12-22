import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int[] a = new int[3];
		int Max = 0;
		int res = 0;
		for(int i=0;i<3;i++) {
			int t = nextInt();
			res += t;
			Max = Math.max(t,Max);
		}
		out.println(res-Max);
	}


	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}