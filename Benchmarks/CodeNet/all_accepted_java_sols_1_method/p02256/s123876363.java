
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b;
		a = sc.nextLong();
		b = sc.nextLong();
		long tmp = 0;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		while (a % b != 0) {
			tmp = a;
			a = b;
			b = tmp % b;
		}
		System.out.println(b);
	}
}