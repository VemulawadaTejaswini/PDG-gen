import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextInt();
		long b = stdIn.nextInt();
		
		long d = a / b;
		long r = a % b;
		double f = (double)a / (double)b;
		
		System.out.print(d + " " + r + " ");
		System.out.printf("%f\n", f);
	}
}