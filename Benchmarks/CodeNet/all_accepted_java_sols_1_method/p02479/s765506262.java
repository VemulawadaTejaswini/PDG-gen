import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double ans = r * r * Math.PI;
		double syu = 2 * r * Math.PI;
		System.out.println(String.format("%.6f %.6f",ans, syu));

	}

}