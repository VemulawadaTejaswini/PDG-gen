import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		for (long i = 0; i <= n; i++) {
			long x = i*(i+1)/2;
			long y = (i+1)*(i+2)/2;
			if (x < n && n <= y) {
				System.out.println(i+1);
				return;
			}
		}
	}
}
