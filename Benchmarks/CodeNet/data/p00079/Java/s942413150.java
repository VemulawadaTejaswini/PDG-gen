import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0079
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 0;
		P[] ps = new P[20];
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			ps[n++] = new P(Double.valueOf(ss[0]), Double.valueOf(ss[1]));
		}
		
		double S = 0.0;
		for (int i = 2; i < n; i++) {
			System.out.println(i - 1 + " " + i);
			S += getArea(ps[0], ps[i - 1], ps[i]);
		}
		System.out.printf("%.6f", S);
	}	
	
	static double getArea(P pa, P pb, P pc) {
		double a = hypot(pb.x - pc.x, pb.y - pc.y),
				b = hypot(pc.x - pa.x, pc.y - pa.y),
				c = hypot(pa.x - pb.x, pa.y - pb.y);
		double z = (a + b + c) / 2;
		return sqrt(z * (z - a) * (z - b) * (z - c));
	}
}

class P {
	double x, y;
	P (double x, double y) {
		this.x = x;
		this.y = y;
	}
}