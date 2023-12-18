
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		System.out.printf("%.6f ", (r*r)*Math.PI);
		System.out.printf("%.6f ", (2*r)*Math.PI);
	}
}