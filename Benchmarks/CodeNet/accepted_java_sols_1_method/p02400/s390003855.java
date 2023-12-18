import static java.lang.System.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		out.printf("%.6f %.6f%n",num * num * Math.PI,
				   num * 2 * Math.PI);
		sc.close();
	}
}
