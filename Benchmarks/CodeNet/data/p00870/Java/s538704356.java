import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();

			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			String in[] = new String[n];

			for (int i = 0; i < n; i++) {
				in[i] = sc.next();
			}

			String buffer = "";
			
			for (int i = 0; i < m; i++) {
				buffer += sc.next();
			}
			int len = buffer.length();

			boolean[][] ans = new boolean[1 << n][len + 100];
			Arrays.fill(ans[0],true);
			long res = 0;
			for (int j = 0; j < len; j++) {
				for (int i = 0; i < n; i++) {
					if (buffer.startsWith(in[i])) {
						for (int k = 0; k < 1 << n; k++) {
							if (!ans[k][j]) {
								continue;
							}
							int shi = 1 << i;
							if ((k & shi) != 0) {
								continue;
							}
							if(ans[k|shi][j+in[i].length()]){
								continue;
							}
							ans[k | shi][j + in[i].length()] = ans[k][j];
							if ((k | shi) == (1 << n) - 1) {
//								System.out.println(j);
								res++;
							}
						}
					}

				}
				buffer = buffer.substring(1);
//				System.out.println(buffer);
			}
			System.out.println(res);
		}
	}
	

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}