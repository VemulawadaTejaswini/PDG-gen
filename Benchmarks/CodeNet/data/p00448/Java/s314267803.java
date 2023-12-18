import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int r = sc.nextInt(), c = sc.nextInt();
			if (r == 0) break;
			int[][] senb = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					senb[i][j] = sc.nextInt();
				}
			}
			
			int ans = 0;
			int count;
			for (int i = 0; i < 1<<r; i++) {
				count = 0;
				for (int j = 0; j < c; j++) {
					int m = 0;
					for (int k = 0; k < r; k++) {
						if ((i>>k & 1) == 1) {
							m += (1-senb[k][j]);
						} else {
							m += senb[k][j];
						}
					}
					count += Math.max(m, r-m);
				}
				ans = Math.max(ans, count);
			}
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}