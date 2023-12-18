import java.util.*;

public class Main {
	
	static int judge(double x,double y,double r, double X, double Y, double R){
		double l = Math.sqrt((x-X)*(x-X)+(y-Y)*(y-Y));
		double s1 = Math.abs(R-r);
		double s2 = R+r;
		if(s1 > l) return (r>R) ? 2 : -2;
		if(s2 < l) return 0;
		return 1;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			double xa,ya,ra,xb,yb,rb;
			xa = sc.nextDouble();
			ya = sc.nextDouble();
			ra = sc.nextDouble();
			xb = sc.nextDouble();
			yb = sc.nextDouble();
			rb = sc.nextDouble();
			
			System.out.println(judge(xa,ya,ra,xb,yb,rb));
			
		}
	}

	
}