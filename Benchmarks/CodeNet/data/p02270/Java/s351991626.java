
import java.util.Scanner;

public class Main {
	
	static int MAX = 10000;
	static int n, k;
	static int[] T = new int[MAX];

	//Check how much packages could be put with the load P.
	static int check(int P) {
		int i = 0;
		for (int j=0; j<k; j++) {
			int s = 0;
			while (s+T[i] <= P) {
				s += T[i];
				i++;
				if (i==n) return n;
			}
		}
		return i;
	}
	
	static int solve() {
		int left = 0;
		int right = 10000 * 10000;
		int mid;
		while (right-left>1) {
			mid = (left + right) / 2;
			int v = check(mid);
			if (v >= n) right = mid;
			else left = mid;
		}
		return right;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for (int i=0; i<n; i++) 
			T[i] = sc.nextInt();
		sc.close();
		int P = solve();
		System.out.println(P);
	}

}

