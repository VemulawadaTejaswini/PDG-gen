import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double d = sc.nextInt();
		sc.close();

		System.out.println((int) Math.ceil(n / (2 * d + 1)));
	}
}
