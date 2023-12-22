import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;i++) {
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double r1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double r2=sc.nextDouble();

		double d=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2), 2));
		if(d>r1+r2)ans=0;
		if(Math.abs(r1-r2)<=d&&d<=r1+r2)ans=1;
		if(d<r1-r2)ans=2;
		if(d<r2-r1)ans=-2;
		System.out.println(ans);
		}
	}
}

