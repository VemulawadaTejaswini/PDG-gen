
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			String buffer = sc.next();

			if (buffer.equals("#")) {
				break;
			}

			int n = buffer.length();

			int dpl[][] = new int[n + 1][4];
			int dpr[][] = new int[n + 1][4];

			for (int i = 0; i < n + 1; i++) {
				Arrays.fill(dpl[i], Integer.MAX_VALUE >> 2);
				Arrays.fill(dpr[i], Integer.MAX_VALUE >> 2);
			}
			dpl[0][3] = 0;
			dpr[0][3] = 0;

			for (int i = 0; i < n; i++) {
				char ch = buffer.charAt(i);
				int v = (ch - '1') % 3;
				for (int prev = 0; prev < 3; prev++) {
					if (prev >= v) {
						dpl[i + 1][v] = Math.min(dpl[i + 1][v], dpr[i][prev]);
					}
					if (prev <= v) {
						dpr[i + 1][v] = Math.min(dpr[i + 1][v], dpl[i][prev]);
					}
					dpl[i + 1][v] = Math.min(dpl[i + 1][v], dpl[i][prev]+1);
					dpr[i + 1][v] = Math.min(dpr[i + 1][v], dpr[i][prev]+1);
				}
				dpl[i + 1][v] = Math.min(dpl[i + 1][v], dpr[i][3]);
				dpr[i + 1][v] = Math.min(dpr[i + 1][v], dpl[i][3]);
			}
			
			int ans = Integer.MAX_VALUE;
			for(int i =0 ; i < 4;i++){
				ans = Math.min(dpl[n][i],ans);
				ans = Math.min(dpr[n][i],ans);
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}