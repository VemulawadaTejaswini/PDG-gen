import java.util.Scanner;
import java.lang.Math;
public class circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double d = 2*r*Math.PI;
		double a = r*r*Math.PI;
		System.out.printf("%f %f\n", a, d);
	}
	
}