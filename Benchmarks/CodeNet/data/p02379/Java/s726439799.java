import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.println(Math.sqrt(x1+x2)+Math.sqrt(y1+y2));
		
	}
}