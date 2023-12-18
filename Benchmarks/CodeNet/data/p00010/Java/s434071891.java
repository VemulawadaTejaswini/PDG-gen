import java.util.Scanner;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			double[] x = new double[3];
			double[] y = new double[3];
			
			for (int j=0;j<3;j++) {
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
			}
			
			double a1 = 2 * ( x[1] - x[0] );
			double b1 = 2 * ( y[1] - y[0] );
			double c1 = x[0] * x[0] - x[1] * x[1] + y[0] * y[0] - y[1] * y[1];
			double a2 = 2 * ( x[2] - x[0] );
			double b2 = 2 * ( y[2] - y[0] );
			double c2 = x[0] * x[0] - x[2] * x[2] + y[0] * y[0] - y[2] * y[2];
			
			double xp = (b1*c2-b2*c1)/(a1*b2-a2*b1);
			double yp = (c1*a2-c2*a1)/(a1*b2-a2*b1);
			double r = Math.sqrt( (xp-x[0])*(xp-x[0]) + (yp-y[0])*(yp-y[0]) );
			
			System.out.printf("%.3f %.3f %.3f\n",xp,yp,r);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}