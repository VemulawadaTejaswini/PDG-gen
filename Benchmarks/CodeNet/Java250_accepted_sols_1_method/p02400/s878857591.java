import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double r = stdIn.nextDouble();
		
		System.out.printf("%.6f %.6f",r*r*Math.PI,r*2*Math.PI);
	}

}