import java.util.Scanner;

class Main {
	public static void main(String args[]){	

	Scanner scan = new Scanner(System.in);

	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double c = scan.nextDouble();
	
	c = Math.toRadians(c);
	
	double h = b * Math.sin(c);
	double s = a*h/2;
	double l = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(c)) + a + b;
	
	System.out.println(s);
	System.out.println(l);
	System.out.println(h);
	}
}