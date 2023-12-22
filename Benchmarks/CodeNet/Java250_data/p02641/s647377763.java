import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int X = sc.nextInt();
		int N = sc.nextInt();
		boolean[] able = new boolean[201];
		Arrays.fill(able, true);
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			able[p] = false;
		}
		for(int i = 0; i <= 100; i++) {
			if(able[X-i]) {
				System.out.println(X-i);
				return;
			}
			if(able[X+i]) {
				System.out.println(X+i);
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
