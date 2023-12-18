import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		solve(N, X, T);
	}

	private static void solve(int n, int x, int t) {
		// TODO Auto-generated method stub
		int sum = t;
		if (x == 1) System.out.println(n * t);
		else {
			if (n < x) System.out.println(sum);
			else {
				n -= x;
				int d = n / t;
				sum += (t * d);
				System.out.println(sum);
			}
		}
	}

}
