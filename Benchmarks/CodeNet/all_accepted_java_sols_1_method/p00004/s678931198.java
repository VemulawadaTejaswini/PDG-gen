import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;

		double x=0,y=0;

		while(scan.hasNextInt()){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
			e = scan.nextInt();
			f = scan.nextInt();

			double det = (double)(d*b - a*e);

			y = (double)(d*c-a*f)/det;
			x = (double)(c-b*y)/a;

			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}