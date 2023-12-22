import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	void doIt() {
		char a = sc.next().charAt(0);
		if('A' <= a && a <= 'Z') {
			System.out.println('A');
		}
		else {
			System.out.println('a');
		}

	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
