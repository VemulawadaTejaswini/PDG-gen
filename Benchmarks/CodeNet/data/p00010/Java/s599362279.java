import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N=cin.nextInt();
		for(;N--!=0;){
			double x1=cin.nextDouble();
			double y1=cin.nextDouble();
			double x2=cin.nextDouble();
			double y2=cin.nextDouble();
			double x3=cin.nextDouble();
			double y3=cin.nextDouble();
			double p = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
			double q = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*x1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
			double dist = Math.sqrt(Math.pow(x1-p, 2)+Math.pow(y2-q, 2));
			BigDecimal ans1 = new BigDecimal(String.valueOf(p));
			BigDecimal ans2= new BigDecimal(String.valueOf(q));
			BigDecimal ans3 = new BigDecimal(String.valueOf(dist));
			p=ans1.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			q=ans2.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			dist=ans3.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%.3f ",p);
			System.out.printf("%.3f ",q);
			System.out.printf("%.3f\n",dist);
//			System.out.println(ans(p)+" "+ans(q)+" "+ans(dist));
		}
	}
	static String ans(double a){
		String s = String.valueOf(a);
		for(;s.length()!=5;){
			s=s+"0";
		}
		return s;
	}
}