import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		String data = null;
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double x = 0;
		double y = 0;
		while(stdin.hasNext()) {
			a = stdin.nextDouble();
			b = stdin.nextDouble();
			c = stdin.nextDouble();
			d = stdin.nextDouble();
			e = stdin.nextDouble();
			f = stdin.nextDouble();
			x = (e * c - b * f) / (e * a - b * d);
			y = (a * f - c * d) / (e * a - b * d);
			System.out.println(x + " " + y);
			
		}
		
		
	}
}