import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		double Cc = C * Math.PI /180;
		
		double L = Math.sqrt(a * a + b * b + 2 * a * b * Math.cos(Cc));
		double h = b * Math.sin(Cc);
		double S = b * Math.sin(Cc) * a /2;
		
		System.out.println(S);
		System.out.println(L + a + b);
		System.out.println(h);
	}
}