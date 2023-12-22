import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		
		double area = r * r * Math.PI;
		double circle = (r + r) * Math.PI;
		
		System.out.printf("%.8f %.8f", area, circle);
	}
}