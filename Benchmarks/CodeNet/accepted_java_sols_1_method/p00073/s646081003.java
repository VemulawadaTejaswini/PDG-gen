import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			if ( x == 0 && h == 0 ) break;
			double te = x*x;
			double h2 = Math.sqrt( ( (x/2) * (x/2) ) + (h*h));
			double tan = x * h2 / 2.0;
			System.out.printf("%.6f%n",te+tan*4);
		}
	}
}