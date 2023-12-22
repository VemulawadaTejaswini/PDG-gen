import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long T = scan.nextLong();
		long[] t = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
		}

		boolean f = true;
		long ans = 0;

		for (int i = 0; i < n-1; i++) {
			if(t[i+1]-t[i] < T) {
				ans+=t[i+1]-t[i];
			} else {
				ans+=T;
				f = false;
			}
		}

		ans += T;
		System.out.println(ans);
	}
}
