import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		System.out.println((double)(n - n / 2)/n);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
