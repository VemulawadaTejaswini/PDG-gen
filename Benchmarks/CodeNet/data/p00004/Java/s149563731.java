import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			double a = scan.nextInt();
			double b = scan.nextInt();
			double c = scan.nextInt();
			double d = scan.nextInt();
			double e = scan.nextInt();
			double f = scan.nextInt();

			double x;
			double y;

			x = ((c * e) - (f * b)) / ((a * e) - (d * b));
			y = ((c * d) - (f * a)) / ((b * d) - (e * a));
			System.out.print(x);
			System.out.print(" ");
			System.out.println(y);
			if (scan.hasNext() == true)
				break;
		}
		System.out.println("??????");
	}

}