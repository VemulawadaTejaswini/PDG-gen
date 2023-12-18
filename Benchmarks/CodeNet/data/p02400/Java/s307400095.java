import java.util.*;

class Main{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		
		System.out.printf("%f %f", r*r*Math.PI, 2*Math.PI*r);
	}
}