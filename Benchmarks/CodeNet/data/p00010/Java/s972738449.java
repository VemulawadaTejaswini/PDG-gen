import java.util.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double p = ((x2*x2+y2*y2-x1*x1-y1*y1)*(x3-x1)-(x3*x3+y3*y3-x1*x1-y1*y1)*(x2-x1))/(2*((y2-y1)*(x3-x1)-(y3-y1)*(x2-x1)));
//			double p = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
			double q = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*x1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
			double r = Math.sqrt((x1-p)*(x1-p) + (y1-q)*(y1-q));
			System.out.println(new BigDecimal(p).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(q).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(r).setScale(3, BigDecimal.ROUND_HALF_UP));
		}
	}
}