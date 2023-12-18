import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = Double.parseDouble(scan.next());
		double b = Double.parseDouble(scan.next());
		double c = Double.parseDouble(scan.next());
		double d = Double.parseDouble(scan.next());
		System.out.println(String.format("%6f",Math.sqrt((c-a)*(c-a)+(d-b)*(d-b))));
	}

}