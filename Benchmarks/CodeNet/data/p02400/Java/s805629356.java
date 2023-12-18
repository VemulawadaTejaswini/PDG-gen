package hello_world;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double r =sc.nextDouble();
		double m=(r*r)*3.14159265358;
		double n =(r+r)*3.14159265358;
		System.out.printf("%.6f %.6f",m,n);
	}

}

