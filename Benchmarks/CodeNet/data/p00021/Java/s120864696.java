import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int rept = in.nextInt();
		while(rept-- > 0){
			double x1 = in.nextDouble(), y1 = in.nextDouble(),
					x2 = in.nextDouble(), y2 = in.nextDouble(),
					x3 = in.nextDouble(), y3 = in.nextDouble(),
					x4 = in.nextDouble(), y4 = in.nextDouble();
			double p1 = x2 - x1, p2 = y2 - y1, q1 = x4 - x3, q2 = y4 - y3,
			r1 = x3 - x2, r2 = y3 - y2, s1 = x4 - x2, s2 = y4 - y2;
			if(Math.abs(p1*q2 - p2*q1)<1e-5 && Math.abs(p1*r2 - p2*r1)>1e-5 && Math.abs(p1*s2 - p2*s1)>1e-5 
					&& p1*p1 + p2*p2>1e-5 && q1*q1 + q2*q2 > 1e-5)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}