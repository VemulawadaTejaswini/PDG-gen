import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		while(scan.hasNext()) {
			looprun();
		}

		scan.close();
	}

	private double x1,y1,x2,y2,x3,y3,xp,yp;
	private boolean x12,x23,x31;

	private void looprun() {
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		x3 = scan.nextDouble();
		y3 = scan.nextDouble();
		xp = scan.nextDouble();
		yp = scan.nextDouble();

		x12 = (xp - x2) * (y1 - y2) - (x1 - x2) * (yp - y2) < 0;
		x23 = (xp - x3) * (y2 - y3) - (x2 - x3) * (yp - y3) < 0;
		x31 = (xp - x1) * (y3 - y1) - (x3 - x1) * (yp - y1) < 0;

		System.out.println(x12 == x23 && x23 == x31  ? "YES" : "NO" );
	}
}
