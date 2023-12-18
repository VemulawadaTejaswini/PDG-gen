import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();

		double tri = (a * a * b) / 2; 
		double degree = 0;

		if(x > tri){
			degree = Math.toDegrees(Math.atan(((2 * a * a * b) - (2 * x))/(a*a*a)));
		}
		else{
			degree = Math.toDegrees(Math.atan( (a * b * b)/(2 * x) ));
		}
		System.out.println(degree);
	}
}