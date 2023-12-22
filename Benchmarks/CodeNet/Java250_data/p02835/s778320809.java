import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		System.out.println((sc.nextInt() + sc.nextInt() + sc.nextInt() > 21)?"bust":"win");
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
