import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
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
			
			if(x == 0) x = 0;
			if(y == 0) y = 0;
			
			System.out.printf("%.3f",x);
			System.out.print(" ");
			System.out.printf("%.3f",y);
			System.out.println();
		}
	}

}