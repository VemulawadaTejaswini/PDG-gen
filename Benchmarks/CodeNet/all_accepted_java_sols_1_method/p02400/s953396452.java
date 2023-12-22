import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		double r = Double.parseDouble(line);

		double area, length;
		area = r * r * Math.PI;
		length = 2 * r * Math.PI;
		System.out.printf("%.6f %.6f", area, length);
	}

}
