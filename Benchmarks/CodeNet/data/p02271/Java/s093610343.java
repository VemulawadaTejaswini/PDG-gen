import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] A = new int[20];
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int val = in.nextInt();
			if (solve(val, n, 0, A)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	static boolean solve(int val, int n, int now, int[] A) {
		if (val == 0) return true;
		if (val < 0) return false;
		if (n == now) return false;
		else {
			if (solve(val-A[now], n, now+1, A)) {
				return true;
			}
			if (solve(val, n, now+1, A)) {
				return true;
			}
		}
		return false;
	}
}

