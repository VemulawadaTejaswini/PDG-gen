import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextInt();
		long b = stdIn.nextInt();
		long c = stdIn.nextInt();
		long d = stdIn.nextInt();
		
		System.out.println(Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d))));
	}
}