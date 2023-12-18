import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		double r = sc.nextInt();
		
		double PI		= 3.14159265359;
		
		double area		= r * r * PI;
		double circle	= 2 * PI * r;
		
		System.out.printf("%05f %05f", area, circle);
	}
}