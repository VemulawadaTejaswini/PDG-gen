import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final double x1 = sc.nextDouble();
		final double y1 = sc.nextDouble();
		final double x2 = sc.nextDouble();
		final double y2 = sc.nextDouble();
		
		System.out.printf("%.7f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
		
	}
}