import java.util.Scanner;


public class Scanner{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double  a = sc.nextInt();
		double length = 2 * a * Math.PI;
		double area = a * a * Math.PI;
		System.out.printf("%.6f %.6f", area, length);
	}
}