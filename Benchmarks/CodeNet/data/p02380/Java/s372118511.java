import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		int input_side_a  = 0;
		int input_side_b  = 0;
		int input_angel_c  = 0;

		double side_c =0;
		double area_s = 0.0;
		double circum_l = 0.0;
		double height_h = 0.0;
		double radians_c = 0.0;

		Scanner sc= new Scanner( System.in );

		input_side_a = sc.nextInt();
		input_side_b = sc.nextInt();
		input_angel_c = sc.nextInt();

		radians_c = Math.toRadians( input_angel_c );

		area_s = ( 1.0 / 2.0 ) * input_side_a * input_side_b * Math.sin( radians_c );
		side_c = Math.sqrt( Math.pow( input_side_a, 2 ) + Math.pow( input_side_b, 2 ) - 2 * input_side_a * input_side_b * Math.cos( radians_c ) );
		circum_l = input_side_a + input_side_b + side_c;
		height_h = input_side_b * Math.sin( radians_c );

		System.out.println( area_s );
		System.out.println( circum_l );
		System.out.println( height_h );

		sc.close();
	}
}
