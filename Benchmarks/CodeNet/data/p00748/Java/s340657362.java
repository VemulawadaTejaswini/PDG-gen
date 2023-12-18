import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] p = new int[181];
	int[] oddp = new int[46];
	
	int[] memo = new int[1000001];
	int[] oddmemo = new int[1000001];
	
	int calc(int n, int index) {
		if (memo[n] == 0) {
			if (index == 0) memo[n] = n;
			else {
				while (n < p[index]) index--;
				if (n == p[index]) memo[n] = 1;
				else {
					int min = 1000000;
					for (int i = index; i >= 0; i--) {
						if (min >= n/p[i])
							min = Math.min(min, calc(n-p[i], i));
					}
					memo[n] = min+1;
				}
			}
		}
		return memo[n];
	}
	
	int calcodd(int n, int index) {
		if (oddmemo[n] == 0) {
			if (index == 0) oddmemo[n] = n;
			else {
				while (n < oddp[index]) index--;
				if (n == oddp[index]) oddmemo[n] = 1;
				else {
					int min = 1000000;
					for (int i = index; i >= 0; i--) {
						if (min >= n/oddp[i])
							min = Math.min(min, calcodd(n-oddp[i], i));
					}
					oddmemo[n] = min+1;
				}
			}
		}
		
		return oddmemo[n];
	}
	
	void run() {
		int n;
	
		
		for (int i = 0; i < 181; i++) {
			p[i] = (i+1)*(i+2)*(i+3)/6;
			if (i % 4 == 0) {
				oddp[i/4] = (i+1)*(i+2)*(i+3)/6;
			}
		}
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;

			out.printf("%d %d\n", calc(n, 180), calcodd(n, 45));
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}