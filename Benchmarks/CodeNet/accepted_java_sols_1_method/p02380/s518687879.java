import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = Math.toRadians(sc.nextDouble());
		Double s = (a*b)*(Math.sin(c))/2.0;
		Double d = Math.sqrt(a*a+b*b-2*a*b*Math.cos(c));
		Double l = a+b+d;
		Double h = b*Math.sin(c);
		System.out.printf("%.5f\n",s);
		System.out.printf("%.5f\n",l);
		System.out.printf("%.5f\n",h);
	}
}