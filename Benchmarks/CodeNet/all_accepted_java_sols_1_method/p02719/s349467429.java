import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long k = sc.nextLong();

			if(n == 0) {
				System.out.println(0);
			} else {
				long mod = n % k;
				long ans = Math.abs(mod - k);
				System.out.println(Math.min(mod, ans));
			}
		}

	}

}
