import java.util.Scanner;

public class Main {
	public static double tri(double x1, double y1, double x2, double y2, double x3, double y3) {
		double vx1 = x2-x1;
		double vy1 = y2-y1;
		double vx2 = x3-x1;
		double vy2 = y3-y1;
		
		return vx1*vy2 - vx2* vy1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[][] p = new double[3][2];
			for(int i=0; i<3; i++) {
				p[i][0] = sc.nextDouble();
				p[i][1] = sc.nextDouble();
			}
			double px = sc.nextDouble();
			double py = sc.nextDouble();
			
			boolean f = true;
			boolean g = true;
			
			for(int i=0; i<3; i++) {
				double tri = tri(p[i][0], p[i][1], p[(i+1)%3][0], p[(i+1)%3][1], px, py);
				if(tri >= 0) f = false;
				if(tri <= 0) g = false;
			}
			System.out.println(f||g?"YES":"NO");
		}
	}
}

