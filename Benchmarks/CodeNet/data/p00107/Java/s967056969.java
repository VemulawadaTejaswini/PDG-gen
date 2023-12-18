import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int n;
	static int[] e, r;
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1.0e-8;
	
	static boolean read() {
		e = new int[3];
		for(int i = 0; i < 3; i++) e[i] = sc.nextInt(); 
		
		if(e[0] == 0 &&  e[1] == 0 && e[2] == 0) return false;
		n = sc.nextInt();
		r = new int[n];
		for(int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve() {
		double a; double[] b = new double[3];
		boolean ok;
		for(int i = 0; i < 3; i++) b[i] = hypot(e[i], e[(i+1)%3]);
		for(int i = 0; i < n; i++) {		
			a = (double)r[i] * 2;
			ok = false;
			for(int j = 0; j < 3; j++) {
				if((a - b[j]) > EPS) {
					ok = true;
				}
			}
			if(ok) {
				System.out.println("OK");
			} else {
				System.out.println("NA");
			}
		}
	}
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
}