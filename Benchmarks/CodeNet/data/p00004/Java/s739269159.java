import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	static int a,b,c,d,e,f;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		if(!sc.hasNextInt()) return false;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		return true;
	}
	
	static void solve() {
		int det = a * e - b * d;
		double x, y;
		x =  (double)(c*e - b*f) / det;
		y =  (double)(a*f - c*d) / det;
		x = round(x * 1000) / 1000;
		y = round(y * 1000) / 1000;
		System.out.printf("%.3f %.3f\n", x, y);
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}

}