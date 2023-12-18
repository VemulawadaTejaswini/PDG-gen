import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	double r,m,s;
	Scanner scan = new Scanner(System.in);
	
	r= scan.nextDouble();
	
	m=r*r*Math.PI;
	s=2*r*Math.PI;
	System.out.printf("%f %f",m,s);
	}
	
}