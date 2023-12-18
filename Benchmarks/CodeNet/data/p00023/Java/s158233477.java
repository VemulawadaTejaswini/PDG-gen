import java.util.*;

class Main {
	
	static double EPS = 1e-9;
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
			double x1 = in.nextDouble(), y1 = in.nextDouble(), r1 = in.nextDouble(),
					x2 = in.nextDouble(), y2 = in.nextDouble(), r2 = in.nextDouble();
			double d = getDist(x1, x2, y1, y2);
			if(d > r1 + r2 + EPS){
				System.out.println(0);
			}
			else if(d > Math.abs(r1-r2)-EPS){
				System.out.println(1);
			}
			else{
				if(r1 > r2){
					System.out.println(2);
				}
				else{
					System.out.println(-2);
				}
			}
		}
	}
	
	private static double getDist(double x1, double y1, double x2, double y2){
		return Math.hypot(x2-x1, y2-y1);
	}

}