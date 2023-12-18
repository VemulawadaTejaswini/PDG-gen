
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			int[] ids = new int[n];
			int[] ps = new int[n];
			int[] qs = new int[n];
			int[] rs = new int[n];
			int[] cs = new int[n];
			
			for (int i = 0; i < n; i++) {
				int id = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				int r = sc.nextInt();
				int c = 4 * p + 9 * q + 4 * r;
				ids[i] = id;
				ps[i] = p;
				qs[i] = q;
				rs[i] = r;
				cs[i] = c;
			}
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int C = sc.nextInt();
		
			boolean allng = true;
			for (int i = 0; i < n; i++) {
				boolean ok = ps[i] <= P && qs[i] <= Q && rs[i] <= R && cs[i] <= C;
				if (ok) {
					System.out.println(ids[i]);
					allng = false;
				}
			}
			if (allng) {
				System.out.println("NA");
			}
			
		}
	}
}