import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double x1=scan.nextDouble();
			double y1=scan.nextDouble();
			double x2=scan.nextDouble();
			double y2=scan.nextDouble();
			double x3=scan.nextDouble();
			double y3=scan.nextDouble();
			double xp=scan.nextDouble();
			double yp=scan.nextDouble();
			
			double a = x2 - x1;
			double b = x3 - x1;
			double c = xp - x1;
			double d = y2 - y1;
			double e = y3 - y1;
			double f = yp - y1;
			
			b = b/a;
			c = c/a;
			e = e-b*d;
			f = f-c*d;
			
			f = f/e;
			c = c-f*b;
			
			double s = c;
			double t = f;
			
			if(s+t<1 && s>0 && t>0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}	
	}
}