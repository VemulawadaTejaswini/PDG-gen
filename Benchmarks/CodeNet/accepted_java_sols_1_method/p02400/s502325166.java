import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
	    System.out.printf("%.7f %.7f\n", r*r*Math.PI, 2*r*Math.PI);
		sc.close();
	}
}
