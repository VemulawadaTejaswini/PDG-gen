import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long a = Math.abs(x / d);

		if (a >= k) {
			if (x > 0){
				System.out.println(Math.abs(x - (k * d)));
			} else {
				System.out.println(Math.abs(x + (k * d)));
			}
		} else {
			long ans = 0;
			if (x > 0) {
				if (Math.abs(x - (a * d)) > Math.abs(x - (a+1) * d)){
					a++;
				}
				ans = x - (a * d);
				if ((k - a) % 2 == 1){
					if (ans > 0){
						ans -= d;
					} else {
						ans += d;
					}
				}
			} else {
				if (Math.abs(x - (a * d)) > Math.abs(x - (a+1) * d)){
					a++;
				}
				ans = x + (a * d);
				if ((k - a) % 2 == 1){
					if (ans > 0){
						ans -= d;
					} else {
						ans += d;
					}
				}
			}
			System.out.println(Math.abs(ans));
		}
	}


}