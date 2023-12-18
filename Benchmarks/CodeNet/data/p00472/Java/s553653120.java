import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] l = new int[n];
		l[0] = 0;
		for (int i = 1; i < n; i++) {
			final int nextInt = in.nextInt();
			l[i] = l[i - 1] + nextInt;
		}
		int posi = 0;
		int sum = 0;
		int pre, aft = 0;
		for (int i = 0; i < m; i++) {
			pre = aft;
			final int nextInt = in.nextInt();
			posi += nextInt;
			aft = l[posi];
			sum += Math.abs(pre - aft);
			if (sum >= 100000)
				sum %= 100000;
		}
		System.out.println(sum);
	}
}