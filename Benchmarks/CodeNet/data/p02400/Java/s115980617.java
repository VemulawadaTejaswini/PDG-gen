import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		
		double pi = Math.PI;
		double area = pi * r * r;
		double circle = 2 * pi * r;

		System.out.printf("%f %f", area, circle);
	}
}