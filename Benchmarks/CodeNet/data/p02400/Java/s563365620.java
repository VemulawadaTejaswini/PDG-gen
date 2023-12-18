import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		double r  = src.nextDouble();
		double a = r * r * Math.PI;
		double b = r * 2 * Math.PI;
		
		System.out.println(String.format("%.6f %.6f",a ,b));
		
	}
}
