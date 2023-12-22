import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = Math.round(Math.pow(x, 0.5));
		while (x % a != 0) {
			a--;
		}
		long b = x / a;
		System.out.println((b + a - 2));
		sc.close();
	}
}