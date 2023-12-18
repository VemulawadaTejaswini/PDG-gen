
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	int[] ar;
	boolean[] used;
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			ar = new int[10];
			used = new boolean[11];
			for (int i=1;i<=9;i++) {
				ar[i] = sc.nextInt();
			}
			ar[0] = sc.nextInt();
			if (ar[0] == -1) break;
			
			for (int i=0;i<10;i++) used[ar[i]] = true;
			ans = 0;
			solve(0);
			System.out.println(ans);
		}
	}
	
	void solve(int d) {
		if (ar[d] != 0) {
			exec(d);
			return;
		}

		for (int i=1;i<=10;i++) if (!used[i]) {
			used[i] = true;
			ar[d] = i;
			exec(d);
			ar[d] = 0;
			used[i] = false;
		}
	}
	
	int sum;
	int ans;
	void exec(int d) {
		if (d == 0) {
			solve(d+1);
			return;
		}
		if (d <= 3) sum = -1;
		if (d % 3 == 0 && !ok(ar[d-2], ar[d-1], ar[d])) return;
		if (d > 6 && !ok(ar[d-6], ar[d-3], ar[d])) return;
		if (d == 7 && !ok(ar[3], ar[5], ar[7])) return;
		if (d == 9 && !ok(ar[1], ar[5], ar[9])) return;
		if (d == 9) {
			ans++; return;
		}
		solve(d+1);
	}
	
	boolean ok(int a, int b, int c) {
		if (sum < 0) {
			sum = ( a + b + c ) % ar[0];
			return true;
		}
		return ( a + b + c ) % ar[0] == sum;
	}
	
	void debug(Object...os) {
		System.out.println("[" + Arrays.deepToString(os) + "]");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		new Main().run();
	}
}