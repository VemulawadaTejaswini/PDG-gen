import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double area = a*a*Math.PI;
		double circumference = 2*a*Math.PI;
		String x = String.format("%.6f", area);
		String y = String.format("%.6f", circumference);
		System.out.println(x+" "+y); 
	}
}