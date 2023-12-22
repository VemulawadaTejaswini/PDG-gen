import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		int r = 0;
		while(n-->0) {
			long x = sc.nextLong(), y = sc.nextLong();
			if (x*x+y*y <= d*d) {
				r++;
			}
		}
		System.out.println(r);

	}
}
