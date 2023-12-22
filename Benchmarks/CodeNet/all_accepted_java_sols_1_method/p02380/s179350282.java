import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double c1 = c*Math.PI/180;
		
		System.out.println(String.format("%f", 0.5*a*b*Math.sin(c1))
				+ " " + String.format("%f", a+b+Math.pow(a*a+b*b-2*a*b*Math.cos(c1), 0.5))
				+ " " + String.format("%f", b*Math.sin(c1)));
	}
}
