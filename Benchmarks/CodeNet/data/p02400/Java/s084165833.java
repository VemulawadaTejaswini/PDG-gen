import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double pi = Math.PI;
		double area, circ;
		area = r * r * pi;
		circ = 2 * pi * r;
		System.out.printf("%f %f", area, circ);
	}
	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}