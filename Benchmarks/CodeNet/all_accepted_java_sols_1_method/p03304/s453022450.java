import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long n = scan.nextLong();
		long m = scan.nextLong();
		long d = scan.nextLong();

        double ans = 2 * (m - 1) * (n - d);
        if (d == 0) ans = (m - 1) * (n - d);

        System.out.println(ans / Math.pow(n, 2));
    }
}
