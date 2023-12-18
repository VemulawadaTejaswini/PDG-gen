import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		r = sc.nextDouble();
		double area, around;
		
		area = r * r * Math.PI;
		around = 2 * r * Math.PI;
		
		System.out.println((float)area + " " + (float)around);
	}
}