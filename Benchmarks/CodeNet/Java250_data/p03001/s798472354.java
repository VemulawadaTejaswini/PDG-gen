import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		double w = sc.nextInt();
		double h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(w * h / 2.0 + " " 
		+ ((w / 2 == x && h / 2 == y)?1:0));
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
