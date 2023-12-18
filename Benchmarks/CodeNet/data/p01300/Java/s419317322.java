import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			String buffer = sc.next();
			int n = buffer.length();
			if (n == 1 && '0' == buffer.charAt(0)) {
				break;
			}

			int[] dp = new int[11];

			int prevMod = 0;

			dp[0] = 1;
			int ans = 0;
            int p = 1;
			for (int i = 0; i < n; i++) {
				int next = buffer.charAt(n - 1 - i) - '0';

				int v2 = (prevMod + p* next ) % 11;
				prevMod = v2;
				if (buffer.charAt(n - i - 1) != '0') {
					ans += dp[v2];
				}

				dp[v2]++;
		        p = (p*10)%11;
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}