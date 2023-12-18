import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();

		long x = Math.min(b-1, n);

		System.out.println(((a * x) / b) - (a * (x / b))) ;
	}
}