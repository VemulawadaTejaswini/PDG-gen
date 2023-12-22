import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		
		System.out.printf("%.6f %.6f", a*a*Math.PI, 2*a*Math.PI);
	}
}