import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new java.util.Scanner(System.in);
		long n = scan.nextInt();
		scan.close();
		long power = 1;
		for(int i = 1; i <= n; i++) {
			power *= i;
			power = power % 1000000007;
		}
		System.out.print(power);
	}
}