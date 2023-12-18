import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int n_loop = n;
		int k = sca.nextInt();
		long min = 0L;
		long max = 0L;
		long ans = 0L;
		for(int i = 0; i < k; i++) {
			min += i;
			max += n_loop;
			n_loop--;
		}
		ans = max - min + 1;

		for(int j = k; j <= n; j++) {
			min += j;
			max += n_loop;
			n_loop--;
			ans += max - min + 1;
		}

		ans = ans % (1000000000 + 7);

		System.out.println(ans);

		// 後始末
		sca.close();
	}
}