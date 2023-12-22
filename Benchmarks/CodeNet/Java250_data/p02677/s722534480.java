
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a=sc.nextInt();
		double b=sc.nextInt();
		double h=sc.nextInt();
		double m=sc.nextInt();



		double angle = Math.toRadians( (h * 30 + m * 0.5) - m * 6 );
		double ans = Math.sqrt( a * a + b * b - 2 * a * b * Math.cos(angle) );

		System.out.printf("%.20f %n", ans);





		sc.close();

	}

}
