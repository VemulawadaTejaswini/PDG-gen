import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		
		System.out.printf("%.6f %.6f", r*r*Math.PI, 2*r*Math.PI);
	}	
}