import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int A[];
	boolean res;
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			boolean ans = solve(0, m[i]);
			if(ans) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		
		sc.close();
	}
	
	boolean solve(int i, int m) {
		if(m == 0) return true;
		if(i >= n) return false;
		
		res = solve(i+1,m)||solve(i+1, m-A[i]);
		return res;
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
