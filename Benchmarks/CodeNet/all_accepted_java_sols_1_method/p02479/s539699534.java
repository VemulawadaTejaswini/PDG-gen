import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double are = r * r * Math.PI;
		double circ = r * 2 * Math.PI;
		System.out.printf("%f %f",are,circ);
	}
}