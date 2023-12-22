import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextInt();
		long res = 0;

		if(k <= a) {
			res = k;
		} else if (k <= a + b) {
			res = a;
		} else {
			res = a - (k - (a + b));
		}

		System.out.printf("%d", res);
	}
}
