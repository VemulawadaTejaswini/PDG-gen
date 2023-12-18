import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double a = x.nextDouble();
		double b = 2 * a * Math.PI;
		double c = a * a * Math.PI;
		System.out.printf("%.6f %.6f",b ,c);
		
		
	}

}