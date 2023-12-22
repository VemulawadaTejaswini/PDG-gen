import java.math.BigInteger;
import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long w = sc.nextInt();
			long h = sc.nextInt();
			long x = sc.nextInt();
			long y = sc.nextInt();
			
			long multi = (x * 2 == w && y * 2 == h) ? 1 : 0;
			
			double midx = (double) w / 2;
			double midy = (double) h / 2;
			
			if(Math.abs(midx - x) < EPS) {
				System.out.printf("%.9f %d\n", (double)w * h / 2, multi);
				continue;
			}
			
			double a = (midy - y) / (midx - x);
			double b = y - a * x;
			if(Math.abs(a) < EPS){
				System.out.printf("%.9f %d\n", (double)w * b, multi);
				continue;
			}
			
			double lowx = -1.0 * b / a;
			double hix = (h- b) / a;
			
			double res = (lowx + hix) * h / 2;
			
			System.out.printf("%.9f %d\n",res, multi);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
