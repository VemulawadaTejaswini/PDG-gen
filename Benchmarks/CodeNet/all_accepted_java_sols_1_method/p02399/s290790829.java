import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(String.format("%d %d %.5f", a/b, a%b, 1.0*a/b));
	}
}

