import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		scan.close();
		long ans = Math.min(n % (a+b), a);
		ans +=(n/(a+b))*a;

		System.out.println((a==0)? "0":ans);
	}
}