import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		double x[]=new double[3];
		double y[]=new double[3];
		double xp,yp;
		while(in.hasNextDouble()){
			for(int i=0;i<3;i++){
				x[i]=in.nextDouble();
				y[i]=in.nextDouble();
			}
			xp=in.nextDouble();
			yp=in.nextDouble();
			boolean left=false;
			boolean right=false;
			for(int i=0;i<3;i++){
				int a=i%3,b=(i+1)%3;
				double k=(y[a]-y[b])/(x[a]-x[b]);
				double p=(yp-y[a])/(xp-x[a]);
				left|=(k>p);
				right|=(k<p);
			}
			if(left&right)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		in.close();
	}
}