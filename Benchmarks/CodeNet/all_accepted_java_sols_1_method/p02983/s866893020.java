import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		long l;
		long r;

		Scanner sc = new Scanner(System.in);

		l =  sc.nextInt();
		r =  sc.nextInt();

		long res;

		if (r - l >= 2018) {
			res = 0;
		} else {

			res = 2018;

			for (long i = l; i < r; i++) {

				for (long j = i+1;j <= r; ++j) {
					res = Math.min(res, (i * j) % 2019);
				}

			}
		}

		System.out.println(res);


	}
}
