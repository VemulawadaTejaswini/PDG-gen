import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += l + i;
		}

		int ans = Integer.MAX_VALUE;
		int idx = -1;
		for (int i = 0; i < n; i++) {
			int val = sum - (l + i);
			val = Math.abs(sum - val);
			if (val < ans) {
				ans = val;
				idx = i;
			}
		}
		System.out.println(sum - (l + idx));
	}
}
