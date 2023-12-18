import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		
		double area = r * r * Math.PI;
		double cir = r * 2 * Math.PI;
		
		System.out.println(String.format("%6f", area) + " " + String.format("%6f", cir));
	}
}