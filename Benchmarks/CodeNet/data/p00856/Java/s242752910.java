import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	double[][] memo;
	int[] board;
	int n;
	
	double calc(int p, int turn) {
		if (memo[p][turn] < 0) {
			if (p == n) memo[p][turn] = 1;
			else if (turn == 0) memo[p][turn] = 0;
			else {
				memo[p][turn] = 0;
				for (int i = 1; i <= 6; i++) {
					int t;
					if (p+i <= n) t = p+i;
					else t = n-(p+i-n);
					if (board[t] == 1)
						memo[p][turn] += calc(t, Math.max(0, turn-2))/6.0;
					else if (board[t] == -1)
						memo[p][turn] += calc(0, turn-1)/6.0;
					else
						memo[p][turn] += calc(t, turn-1)/6.0;
				}
			}
		}
		return memo[p][turn];
	}
	
	void run() {
		while (true) {
			int t, l, b;
			n = sc.nextInt(); t = sc.nextInt(); l = sc.nextInt(); b = sc.nextInt();
			if (n == 0) break;
			board = new int[n+1];
			for (int i = 0; i < l; i++)
				board[sc.nextInt()] = 1;
			for (int i = 0; i < b; i++)
				board[sc.nextInt()] = -1;
			
			memo = new double[n+1][t+1];
			for (int i = 0; i <= n; i++)
				Arrays.fill(memo[i], -1);
			
			out.println(calc(0, t));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}