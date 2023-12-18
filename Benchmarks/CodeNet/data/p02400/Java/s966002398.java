import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int r = sc.nextInt();
		
		double area		= 0;
		double circle	= 0;
		
		double PI		= 3.14159265359;
		
		area	= r * r * PI;
		circle	= 2 * PI * r;
		
		System.out.printf("%f %f", area, circle);
	}
}