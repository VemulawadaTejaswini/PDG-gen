import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long X500 = X / 500;
		X -= X500 * 500;
		long X5 = X / 5;
		long H = X500 * 1000 + X5 * 5;
		System.out.println(H);
	}
}
