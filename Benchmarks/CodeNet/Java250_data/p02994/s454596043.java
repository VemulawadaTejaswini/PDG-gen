import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += l + i - 1;
		}
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (Math.abs(sum - ans) > Math.abs(l + i - 1)) {
				ans = sum - (l + i - 1);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}