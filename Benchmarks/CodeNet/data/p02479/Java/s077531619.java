import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		
		double area = (double)r * r * Math.PI;
		double cir = (double)r * 2 * Math.PI;
		
		System.out.println(String.format("%6f", area) + " " + String.format("%6f", cir));
	}
}