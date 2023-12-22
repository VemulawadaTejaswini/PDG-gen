import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();

		if ( R - L > 2019 ) {
			System.out.println(0);
		} else {
			long ans = 2019;
			for ( long i = L ; i < R ; i++ ) {
				for ( long j = i + 1 ; j <= R ; j++ ) {
					long mod = (i * j) % 2019;
					if ( ans > mod ) {
						ans = mod;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
