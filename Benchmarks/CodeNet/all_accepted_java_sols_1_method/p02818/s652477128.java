import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		if(k >= a + b) {
			System.out.println(0 + " " + 0);
			System.exit(0);
		}

		if(a - k < 0) {
			k = k - a;
			a = 0;
		}else {
			a = a - k;
			k = 0;
		}

		if(k != 0) {
			b = b - k;
			k = 0;
		}
		System.out.println(a + " " + b);
		sc.close();
	}
}
