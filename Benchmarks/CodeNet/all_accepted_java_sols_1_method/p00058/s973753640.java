import java.util.Scanner;

class Main{
	public static void main(String[] aegs) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			double xa=sc.nextDouble();
			double ya=sc.nextDouble();
			double xb=sc.nextDouble();
			double yb=sc.nextDouble();
			double xc=sc.nextDouble();
			double yc=sc.nextDouble();
			double xd=sc.nextDouble();
			double yd=sc.nextDouble();

			double x1=xb-xa;
			double y1=yb-ya;
			double x2=xd-xc;
			double y2=yd-yc;

			double a=x1*x2;
			double b=y1*y2;

			if((float)a+(float)b==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
