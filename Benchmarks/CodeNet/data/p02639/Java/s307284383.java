import java.util.*;

public final class Solution {

	static Scanner sc;

	static void solve() {
		int[] in = new int[5];

		int ans = 0;
		for (int i = 0; i < 5; ++i) {
			int tmp = sc.nextInt();
			if (tmp == 0) ans = i + 1;
		}

		System.out.println(ans);
	}
    
    public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);

		solve();
    }
}
