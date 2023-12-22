import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();
		long k = (long)Math.ceil((Math.sqrt(1 + 8 * X) - 1) / 2);
		System.out.println(k);
	}
}