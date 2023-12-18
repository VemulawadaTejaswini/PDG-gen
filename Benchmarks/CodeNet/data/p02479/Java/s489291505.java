import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	double p =Math.PI;
	System.out.printf("%.6f %.6f\n", r*r*p,2*p*r);
	}
}