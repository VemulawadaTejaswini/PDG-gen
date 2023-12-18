import java.io.PrintStream;
import java.util.Scanner;
 
public class Main {
	static PrintStream o = System.out;
	static Scanner sc = new Scanner(System.in);
	
	private static long ami(long min,long max) {
		if (Math.signum(min) == Math.signum(max)) {
			return Math.abs(min) < Math.abs(max) ? min : max;
		} else {
			return 0;
		}
	}
 
	public static void main(String[] args) {
		long a = sc.nextLong(); 
		long b = sc.nextLong(); 
		long c = sc.nextLong(); 
		long d = sc.nextLong(); 
		long x_max = b;
		long y_max = d;
		long x_min = a;
		long y_min = c;
 
		if (Math.signum(x_max) == 1) {
			if (Math.signum(y_max) == 1) {
				o.println(x_max*y_max);
			} else {
				if (Math.signum(x_min) == -1) {
					o.println(x_min*y_min);
				} else {
					o.println(ami(a,b) * ami(c,d));
				}
			}
		} else {
			if (Math.signum(y_min) == 1) {
				o.println(ami(a,b) * ami(c,d));
			} else {
				o.println(x_min*y_min);
			}
		}
	}
}