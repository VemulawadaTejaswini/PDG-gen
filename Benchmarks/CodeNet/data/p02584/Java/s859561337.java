import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		sc.close();

		if (x / d > k) {
			print(x - d * k);
			return;
		}
		long min = x % d;
		boolean minIsEven = (x / d) % 2 == 0;
		boolean isEven = k % 2 == 0;
		if (minIsEven == isEven) {
			print(min);
			return;
		}
		print(d - min);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
