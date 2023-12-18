import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int d, r;
		float f;
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		while(a < 1 || a > 1000000000 || b < 1 || b > 1000000000) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
		}
		
		d = a / b;
		r = a % b;
		f = (float)a / (float)b;
		
		System.out.println(d + " " + r + " " + f);
		
	}
}
