import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong(), b = sc.nextLong(), k = sc.nextLong();

		if(a + b <= k) {
			a = b = 0;
		} else if(a <= k && k < a + b) {
			b = a + b - k;
			a = 0;
		} else {
			a = a - k;
		}

		System.out.println(a + " " + b);
	}
}
