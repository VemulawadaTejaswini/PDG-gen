import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long ans = 0;
		long min = Long.MAX_VALUE;

		for (long i = l; i < r; i++) {
			for (long j = i + 1; j <= r; j++) {
				long calc = (i * j) % 2019;
				min = Math.min(min, calc);
				if (min == 0) {
					break;
				}
			}
			if (min == 0) {
				break;
			}
		}
		System.out.println(min);


		//		if (r < 2019) {
		//			ans =  (l * (l + 1)) % 2019;
		//
		//		} else if (r - l >= 2019 ) {
		//			ans = 0;
		//
		//		} else if (l < 2019 && 2019 < r) {
		//
		//
		//		} else {
		//			ans =  (l * (l + 1)) % 2019;
		//		}

		//		System.out.println(ans);


	}
}