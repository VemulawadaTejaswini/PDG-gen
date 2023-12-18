import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int t=1;t<=T;t++){
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double r1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double r2=in.nextDouble();
			double d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			int ans;
			if(d>r1+r2)
				ans=0;
			else if(d<r1-r2)
				ans=2;
			else if(d<r2-r1)
				ans=-2;
			else
				ans=1;
			System.out.println(ans);
		}
		in.close();
	}
}