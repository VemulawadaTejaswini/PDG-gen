import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		long d = a / b;
		long r = a % b;
		float f = a / Float.valueOf(b);
		
		System.out.println(String.format("%d %d %f", d, r, f));
	}
}