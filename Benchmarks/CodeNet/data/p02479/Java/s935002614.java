import java.util.*;
import static java.lang.Math.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		System.out.printf("%.5f %.5f\n", r*r*PI, r*2*PI);
	}
}