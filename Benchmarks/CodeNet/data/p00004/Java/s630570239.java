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
			
			y = (c-((a*f)/d))/(b-((a*e)/d));
			x = (c-(b*y))/a;
			
			x = Math.rint(x*1000) * 0.001;
			y = Math.rint(y*1000) * 0.001;
			
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}

}