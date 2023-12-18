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
				double xx=x[a]-x[b];
				double yy=y[a]-y[b];
				double px=xp-x[a];
				double py=yp-y[a];
				left|=(xx*py<yy*px);
				right|=(xx*py>yy*px);
			}
			if(left&right)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		in.close();
	}
}