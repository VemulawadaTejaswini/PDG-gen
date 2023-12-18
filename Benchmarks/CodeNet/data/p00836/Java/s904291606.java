import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		boolean p[] = new boolean[12345];
		Arrays.fill(p, true);
		p[0] = false;
		p[1] = false;

		int count = 0;

		for (int i = 0; i < 123; i++) {
			if (p[i]) {
				for (int j = i + i; j < 12345; j += i){
					p[j] = false;
				}
			}
		}

		for (int i = 0; i < 10001; i++) {
			if (p[i]) {
				count++;
			}
		}

		int pt[] = new int[count + 1];

		int cnt = 1;
		pt[0] = 0;
		for (int i = 0; i < 10001; i++) {
			if (p[i]) {
				pt[cnt] = i + pt[cnt - 1];
				cnt++;
			}
		}
//		System.out.println(Arrays.toString(pt));
		int dp[] = new int[12345];
		for (int s = 0; s < count+1; s++) {
			for (int e = s + 1; e < count+1; e++) {
				if(pt[e]-pt[s] > 10000){
					break;
				}
				dp[pt[e] - pt[s]]++;
			}
		}

		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			System.out.println(dp[n]);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}