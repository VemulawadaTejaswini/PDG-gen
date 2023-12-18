import java.util.*;
public class Main {

	public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			double r;
			r=cin.nextDouble();
			System.out.print(String.format("%.6f %.6f",r*r*3.14159265359,2*r*3.14159265359));
	}
}