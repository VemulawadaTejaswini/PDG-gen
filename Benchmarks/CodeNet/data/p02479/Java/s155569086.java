import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		double s = r * r * Math.PI;
		double l = 2 * r * Math.PI;		

		System.out.printf("%9.6f %9.6f\n", s, l);
	}
}