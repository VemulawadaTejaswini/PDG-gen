import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		double x1,x2,y1,y2,rr;

		Scanner scan = new Scanner(System.in);
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();

		rr = Math.pow( (x1-x2), 2) + Math.pow( (y1-y2), 2);

		System.out.printf("%.5f\n",Math.sqrt(rr) );

		scan.close();
	}
}