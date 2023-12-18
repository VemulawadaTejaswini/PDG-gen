import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		double input_x1  = 0.0;
		double input_y1  = 0.0;
		double input_x2  = 0.0;
		double input_y2  = 0.0;
		
		double distance_p1p2  = 0.0;


		Scanner sc= new Scanner( System.in );

		input_x1 = sc.nextDouble();
		input_y1 = sc.nextDouble();
		input_x2 = sc.nextDouble();
		input_y2 = sc.nextDouble();

		distance_p1p2 = Math.sqrt( Math.pow( input_x2 - input_x1, 2 ) + Math.pow( input_y2 - input_y1, 2 )) ;

		System.out.println( distance_p1p2 );
		
		sc.close();
	}
}
