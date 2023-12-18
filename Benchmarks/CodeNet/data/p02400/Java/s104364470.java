import java.util.Scanner;
import java.util.Math;

public class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		double area = (double)Math.pow(r,2) * Math.PI;
		double around =  2 * (double)r * Math.PI;

		System.out.printf("%.6f %.6f",area,around);
	}
}