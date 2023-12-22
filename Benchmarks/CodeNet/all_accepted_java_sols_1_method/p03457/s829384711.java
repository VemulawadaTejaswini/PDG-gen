import java.util.Scanner;

public class Main {

	static int n, t[], x[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t = new int[n + 1];
		x = new int[2][n + 1];
		for (int i = 1; i <= n; ++i) {
			t[i] = sc.nextInt();
			x[0][i] = sc.nextInt();
			x[1][i] = sc.nextInt();
		}
		sc.close();
		String ans[] = { "Yes", "No" };
		int a = 0;
		for (int i = 1; i <= n; ++i) {
			int tmp = Math.abs(x[0][i] - x[0][i - 1]) + Math.abs(x[1][i] - x[1][i - 1]);
			int tmp2 = t[i] - t[i - 1];
			if(tmp > tmp2) {
				a = 1;
				break;
			}
			else {
				if(tmp % 2 != tmp2 % 2) {
					a = 1;
					break;
				}
			}
		}
		System.out.println(ans[a]);

	}

}
