import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int n = sc.nextInt();
		int p[] = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 1; i < n - 1; i++) {
			if(p[i - 1] < p[i] && p[i] < p[i + 1]) ans++;
			else if(p[i - 1] > p[i] && p[i] > p[i + 1])ans++;
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
