import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		if(n == k) {
			System.out.println(0);
			return;
		}


		if(n>k) {
			long mod = n%k;
			long abs = Math.abs(mod-k);

			if(mod < abs) {
				System.out.println(mod);
			}else {
				System.out.println(abs);
			}
		}else{
			if(n < Math.abs(n-k)) {;
				System.out.println(n);
			}else{
				System.out.println(Math.abs(n-k));
			}
		}

	}
}
