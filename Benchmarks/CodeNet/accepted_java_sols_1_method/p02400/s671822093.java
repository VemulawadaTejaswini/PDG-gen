import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();

		double area = Math.PI * r * r;
		double circle = 2 * Math.PI * r;

		System.out.printf("%f %f", area, circle);
	}
}