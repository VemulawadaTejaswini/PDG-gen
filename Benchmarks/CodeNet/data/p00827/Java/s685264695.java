import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int x, y;
	int extgcd(int a, int b) {
		int d = a;
		if (b != 0) {
			d = extgcd(b, a%b);
			int temp = y;
			y = x - (a/b)*y;
			x = temp;
		} else {
			x = 1; y = 0;
		}
		return d;
	}
	
	void run() {
		while (true) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0) break;
			int d = extgcd(a, b);
			x *= c/d;
			y *= c/d;
			int resx = x, resy = y;
			int p = b/d, q = -a/d;
			for (int k = 1; abs(p*(k-1)+x)>abs(p*k+x) || abs(q*(k-1)+y)>abs(q*k+y); k++) {
				if (abs(p*k+x)+abs(q*k+y) < abs(resx)+abs(resy) || (abs(p*k+x)+abs(q*k+y) == abs(resx)+abs(resy) && a*abs(p*k+x)+b*abs(q*k+y) < a*abs(resx)+b*abs(resy))) {
					resx = p*k+x;
					resy = q*k+y;
				}
			}
			for (int k = -1; abs(p*(k+1)+x)>abs(p*k+x) || abs(q*(k+1)+y)>abs(q*k+y); k--) {
				if (abs(p*k+x)+abs(q*k+y) < abs(resx)+abs(resy) || (abs(p*k+x)+abs(q*k+y) == abs(resx)+abs(resy) && a*abs(p*k+x)+b*abs(q*k+y) < a*abs(resx)+b*abs(resy))) {
					resx = p*k+x;
					resy = q*k+y;
				}
			}
			
			
			out.printf("%d %d\n", abs(resx), abs(resy));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}