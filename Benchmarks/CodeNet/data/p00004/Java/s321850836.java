import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f;
		double x,y;
		
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			
			if(d!=0) y = (c-((a*f)/d))/(b-((a*e)/d));
			else y = 0;
			if(a!=0) x = (c-(b*y))/a;
			else x = 0;
			
			x = Math.rint(x*1000) * 0.001;
			y = Math.rint(y*1000) * 0.001;
			
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}

}