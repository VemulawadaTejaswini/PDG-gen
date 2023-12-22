
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
		for(int i = k + 1; i < n + 1; i++) {
			int div = n / i;
			int res = n % i;
			ans += div * (i - k);
			if(res >= k && k != 0) {
				ans += (res - (k - 1));
			} else if(res >= k && k == 0) {
				ans += (res - k);
			}
		}
		System.out.println(ans);
	}

}
