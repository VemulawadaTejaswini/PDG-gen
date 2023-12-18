import java.util.*;
public class Main {

	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		System.out.printf("%.6f %.6f\n", (r * r * Math.PI), (r * 2 * Math.PI));
	}
}