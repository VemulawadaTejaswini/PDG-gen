import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	double r = sc.nextDouble();
	
	System.out.printf("%.5f %.5f",r*r*Math.PI, r*2*Math.PI);
	
	sc.close();
	}
}
