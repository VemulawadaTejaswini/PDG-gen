import java.util.Scanner;


public class Main {
	
	static double p1x = 0.0;
	static double p1y = 0.0;
	static double p2x = 100.0;
	static double p2y = 0.0;
	
	static void koch(int n,double p1x,double p1y,double p2x,double p2y) {
		if(n == 0) {
			return;
		}
		double sx = (2*p1x + p2x)/3;
		double sy = (2*p1y + p2y)/3;
		double tx = (p1x + 2*p2x)/3;
		double ty = (p1y + 2*p2y)/3;
		
		double rad = Math.PI/3;
		double ux = (tx - sx)*Math.cos(rad) - (ty - sy)*Math.sin(rad) + sx;
		double uy = (tx - sx)*Math.sin(rad) + (ty - sy)*Math.cos(rad) + sy;
		
		koch(n-1,p1x,p1y,sx,sy);
		System.out.printf("%.8f %.8f",sx,sy);
		System.out.println();
		
		koch(n-1,sx,sy,ux,uy);
		System.out.printf("%.8f %.8f",ux,uy);
		System.out.println();
		
		koch(n-1,ux,uy,tx,ty);
		System.out.printf("%.8f %.8f",tx,ty);
		System.out.println();
		
		koch(n-1,tx,ty,p2x,p2y);
	}
	
	void main() {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.printf("%.8f %.8f",p1x,p1y);
		System.out.println();
		
		koch(n,p1x,p1y,p2x,p2y);
		
		System.out.printf("%.8f %.8f",p2x,p2y);
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Main().main();
	}

}
