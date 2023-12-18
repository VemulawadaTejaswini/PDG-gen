

import java.util.Scanner;

/**
 * AOJ id=0023
 * Circles Intersection
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double rb = sc.nextDouble();
			solve(xa, ya, ra, xb, yb, rb);
		}
		
	}

	public void solve(double xa, double ya, double ra, double xb, double yb, double rb) {
		double c = (xa-xb)*(xa-xb)+(ya-yb)*(ya-yb);
		double rd = (ra-rb)*(ra-rb);
		double r = (ra+rb)*(ra+rb);
		double eps = 0;
		if(c<=rd-eps && ra>rb)
			System.out.println(2);
		else if(c<=rd && ra<=rb)
			System.out.println(-2);
		else if(c<=r+eps)
			System.out.println(1);
		else
			System.out.println(0);
		
		
	}

}