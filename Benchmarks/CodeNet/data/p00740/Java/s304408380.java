import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, p, pp;
		int[] num;
		int turn;
		L:while (true) {
			n = sc.nextInt();
			p = sc.nextInt();
			pp = p;
			if (n == 0 && p == 0) break;
			num = new int[n];
			turn = 0;
			while (turn <= 1000000) {
				if (p == 0) {
					p += num[turn%n];
					num[turn%n] = 0;
				} else if (p > 1) {
					p--;
					num[turn%n]++;
				} else {
					p--;
					num[turn%n]++;
					if (num[turn%n] == pp) {
						out.println(turn%n);
						continue L;
					}
				}
				turn++;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}