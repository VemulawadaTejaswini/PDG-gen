import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		double r;
		r = n.nextDouble();
		System.out.printf("%.6f %.6f",r*r*Math.PI, 2*r*Math.PI );
	}
}