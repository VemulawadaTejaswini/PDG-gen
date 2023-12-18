import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] x = new double[3];
		double[] y = new double[3];
		double ansx,ansy;
		double r;
		double a1,a2;
		double b1,b2;
		double c1,c2;
		double temp;
		int n;
		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
			}
			
			a1 = 2*(x[1]-x[0]);
			a2 = 2*(x[2]-x[0]);
			b1 = 2*(y[1]-y[0]);
			b2 = 2*(y[2]-y[0]);
			c1 = (x[0]*x[0])-(x[1]*x[1])+(y[0]*y[0])-(y[1]*y[1]);
			c2 = (x[0]*x[0])-(x[2]*x[2])+(y[0]*y[0])-(y[2]*y[2]);
			
			ansx = (b1*c2-b2*c1)/(a1*b2-a2*b1);
			ansy = (c1*a2-c2*a1)/(a1*b2-a2*b1);
			
			temp = (x[0]-ansx)*(x[0]-ansx)+(y[0]-ansy)*(y[0]-ansy);
			
			r = Math.sqrt(temp);
			
			System.out.printf("%.3f %.3f %.3f\n",ansx,ansy,r);
		}
	}
}