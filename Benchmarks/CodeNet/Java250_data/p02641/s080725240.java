import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}
		int upper = X+1;
		int lower = X-1;
		int ans = -1;

		ans = judge(N, p, X);

		while (ans == -1) {
			ans = judge(N, p, lower);
			if (ans != -1) break;
			ans = judge(N, p, upper);
			upper++;
			lower--;
		}

		System.out.println(ans);
	}

	public static int judge(int N, int[] p, int k) {
		int f = 0;
		int ans = -1;

		for(int i = 0; i < N; i++) {
			if (k == p[i]) {
				f++;
				break;
			}
		}
		if (f == 0) {
			ans = k;
		}
		return ans;

	}

}