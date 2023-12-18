import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		double a,b,c,d,e,f;
		double x = 0,y;

		while(scan.hasNext()) {
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			d = scan.nextDouble();
			e = scan.nextDouble();
			f = scan.nextDouble();

			x = (c * e - b * f) / (a * e - b * d);
			y = (c / b) - (a / b ) * x;

			if(x == -0) { x = 0;}
			if(y == -0) { y = 0;}

			System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
		}

		scan.close();

	}

}
