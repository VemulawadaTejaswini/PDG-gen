import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long sum = 0;
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int ai = a[i];
			if (ai < 0) {
				cnt++;
			}
			ai = Math.abs(ai);
			min = Math.min(min, ai);
			sum += ai;
		}
		if (cnt % 2 == 0) {
			System.out.println(sum);
		} else {
			System.out.println(sum - min * 2);
		}
	}
}
