import java.util.Scanner;

class Main {
	private static double findTheta(int h, int m) {
    	double x = 2*Math.PI / 12 * (h+m/60.0);
		double y = 2*Math.PI / 60 * m;
      	return Math.abs(x-y);
    }
  	private static double findC(int a, int b, double theta) {
    	double c2 = a*a+b*b-2*a*b*Math.cos(theta);
      	return Math.sqrt(c2);
    }
  	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
      	int a, b, h, m;
      	a = in.nextInt();
      	b = in.nextInt();
      	h = in.nextInt();
      	m = in.nextInt();
      	double theta = findTheta(h, m);
      	System.out.println(findC(a, b, theta));
    }
}