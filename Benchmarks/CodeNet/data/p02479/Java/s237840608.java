import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%f %f", r*2*PI, r*r*PI);
	}
}