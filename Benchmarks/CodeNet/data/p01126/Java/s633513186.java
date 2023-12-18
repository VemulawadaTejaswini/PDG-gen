import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m, a;
		while (true) {
			n = sc.nextInt(); m = sc.nextInt(); a = sc.nextInt();
			if (n == 0) break;
			int[][] amida = new int[n+1][1001];
			for (int i = 0; i < m; i++) {
				int h = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
				amida[p][h] = q;
				amida[q][h] = p;
			}
			int index = a;
			for (int i = 1000; i >= 0; i--) {
				if (amida[index][i] > 0)
					index = amida[index][i];
			}
			out.println(index);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}