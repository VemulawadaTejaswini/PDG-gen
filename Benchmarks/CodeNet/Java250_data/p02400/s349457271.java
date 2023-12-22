import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		double r = scan.nextDouble();
		double s=0.0, l=0.0;
		
		s = r * r * Math.PI;
		l = 2 * Math.PI * r;
		
		System.out.println(String.format("%5f", s)+" "+String.format("%5f", l));	
	}
}