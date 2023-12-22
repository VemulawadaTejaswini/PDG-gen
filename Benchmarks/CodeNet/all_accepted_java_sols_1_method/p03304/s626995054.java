import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long n = scan.nextLong();
		long m = scan.nextLong();
		long d = scan.nextLong();

        double ans = (m - 1) * (n - d) * 2;
        if (d == 0) {
            ans = (m - 1) * (n - d);
        }
        System.out.println(ans / Math.pow(n, 2));
    }
}
