import java.util.Scanner;

public class aizu14 {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		double S, cir;
		double r = stdIn.nextDouble();
		
		while(0 > r || r > 10000f) {
			r = stdIn.nextDouble();
		}
		
		cir = Math.PI * 2 * r;
		S = Math.PI * r * r;
		
		System.out.println(S + " " + cir);
		
		
	}
}
