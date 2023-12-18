import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int X = sc.nextInt();
		int Y = sc.nextInt();
		for(int i = 0; i <= X; i++) {
			if(Y == i * 2 + (X - i) * 4) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
