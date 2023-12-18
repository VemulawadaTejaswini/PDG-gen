import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double x=Math.PI;
		double dbArea = 0;
		double dblongth = 0;

		dbArea = r*r*x;
		dblongth = 2*r*x;
		System.out.printf("%.6f %.6f%n",dbArea,dblongth);
		//System.out.printf("%d %d %.7f%n",d,r,f);
	}
}