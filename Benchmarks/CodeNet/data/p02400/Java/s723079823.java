
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double m=r*r*Math.PI;
		double e=2*r*Math.PI;
		System.out.printf( "%.7f %.7f",m,e  ) ;

	}

}

