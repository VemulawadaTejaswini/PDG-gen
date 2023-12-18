import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			int s = in.nextInt();
			if(n == 0 && s == 0) return;
			System.out.println(solve(n, s, 0));
		}
	}

    public static int solve(int n, int s, int d) {
		if(d > 9) return 0;
		if(s < 1) return 0;
		if(n==0) {
			if(s == 0) return 1;
			else return 0;
		}
		int ans = 0;
		ans += solve(n, s, d+1);
		ans += solve(n-1, s-d, d+1);
		return ans;
	}
}