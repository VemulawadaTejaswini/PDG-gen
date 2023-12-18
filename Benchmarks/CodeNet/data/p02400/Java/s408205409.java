import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.println(String.format("%.6f %.6f", Math.PI * r * r, 2.0 * Math.PI * r));
	}
}

