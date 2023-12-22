import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextInt();
		long k = scan.nextInt();
		long i = 0;
		long a = 1;

		for (i = 0; i < n-1; i++) {

			a = a * (k - 1);

			//System.out.println(a);
		}

		if (n > 1) {
			System.out.println(k * a);

		} else if(n==1) {
			System.out.println(k);

		}

	}

}