

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r,pi,a,b;
		pi=Math.PI;
		r=sc.nextDouble();
		a=pi*r*r;
		b=2*pi*r;
	System.out.printf("%f %f\n",a,b);
	}
}

