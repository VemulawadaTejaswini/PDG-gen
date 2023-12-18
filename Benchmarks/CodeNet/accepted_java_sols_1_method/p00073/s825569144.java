import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0073
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] cs = new char[8][8];
	public static void main(String[] args) {
		while (true) {
			int x = sc.nextInt(), h = sc.nextInt();
			if (x == 0 && h == 0) break;
			double dx = (double)x, dh = (double)h;
			double S = dx * dx +
					( ( 2 * dx * sqrt(dx * dx + 4 * dh * dh) ) / 2 );
			System.out.printf("%.6f", S);System.out.println();
		}
	}
	
}