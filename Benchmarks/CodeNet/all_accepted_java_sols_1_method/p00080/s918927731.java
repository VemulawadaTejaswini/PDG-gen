import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0080
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int q = sc.nextInt();
			if (q == -1) break;
			
			double x = (double)q / 2;
			while (abs(x * x * x - q) >= 0.00001 * q) {
				x = x - (x * x * x - q) / (3 * x * x);
			}
			System.out.printf("%.6f", x);
			System.out.println();
		}
	}
}