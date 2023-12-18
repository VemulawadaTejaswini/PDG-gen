import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long rem = Math.abs(x);
		long cal = 0;
		long cnt = 0;
		long befrem = 0;

		for (int i = 0; i < k; i++) {
			befrem = rem;
			rem -= d;
			cal += d;
			cnt++;
			if (rem < 0) {
				break;
			}
		}

		long ans = 0;

		if (x == d) {
			if(k%2==0){
				ans = d;
			}else{
				ans = 0;
			}

		} else {

			// befremと、remの絶対値とどちらが小さいか
			if (Math.abs(rem) < befrem) {
				ans = Math.abs(rem);
			} else {
				// 0にたどり着く
				if (k - cnt % 2 == 0) {
					// たどり着くが戻れない(たどり着いたときの残り移動回数が偶数)
					ans = Math.abs(rem);
				} else {
					// たどり着くし戻れる(たどり着いたときの残り移動回数が奇数)
					ans = befrem;
				}
			}
		}
		System.out.println(ans);

	}
}