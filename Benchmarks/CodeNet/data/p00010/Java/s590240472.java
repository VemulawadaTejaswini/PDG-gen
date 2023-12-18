import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for(int i=0; i<n; i++){
		//1をa
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		//2をb
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		//3をc
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();

		double a1 = 2*(x2 - x1);
		double b1 = 2*(y2 - y1);
		double c1 = Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2);

		double a2 = 2*(x3 - x1);
		double b2 = 2*(y3 - y1);
		double c2 = Math.pow(x1, 2) - Math.pow(x3, 2) + Math.pow(y1, 2) - Math.pow(y3, 2);

		double xp = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
		double yp = (c1*a2 - c2*a1)/(a1*b2 - a2*b1);

		System.out.printf("%.3f %.3f %.3f\n",xp,yp,distance(x1, y1, xp, yp));


		//三角形の面積
		}
	}

	static double distance(double ax, double ay, double bx, double by){
		return Math.sqrt(Math.pow(bx-ax, 2) + Math.pow(by-ay, 2));
	}

}