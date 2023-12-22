import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				set.add(sc.nextInt());
			}
		}
		System.out.println(N - set.size());
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
