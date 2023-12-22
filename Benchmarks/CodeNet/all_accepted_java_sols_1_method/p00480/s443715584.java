import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int left = n - 1;
		long[][] ans = new long[left][21];
		ans[0][in.nextInt()] = 1;
		for (int i = 1; i < left; i++) {
			int val = in.nextInt();
			for (int num = 0; num <= 20; num++) {
				if (ans[i - 1][num] != 0) {
					if (0 <= num - val)
						ans[i][num - val] += ans[i - 1][num];
					if (num + val <= 20) {
						ans[i][num + val] += ans[i - 1][num];
					}
				}
			}
		}
		System.out.println(ans[left - 1][in.nextInt()]);

	}

}