import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextInt();
		long b = stdIn.nextInt();
		
		long d = a / b;
		long r = a % b;
		float f = (float)a / (float)b;
		
		System.out.print(d + " " + r + " ");
		System.out.printf("%.5f\n", f);
	}
}