import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, d;
		n = in.nextInt();
		d = in.nextInt();
		if (n % (2 * d + 1) == 0) {
			System.out.println(n / (2 * d + 1));
		} else {
			System.out.println(n / (2 * d + 1) + 1);
		}
		in.close();
	}
}
