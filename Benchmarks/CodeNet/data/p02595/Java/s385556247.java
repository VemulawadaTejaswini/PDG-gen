
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		double d = scan.nextDouble();
		for(int i = 0; i < n; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double res = solve(x,y);
			if(res <= d) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	public static double solve(double x,double y) {
		double a = Math.pow(x, 2);
		double b = Math.pow(y, 2);
		double c = a + b;
		double res = Math.sqrt(c);
		return res;
	}

}
