
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		
		while(sc.hasNext()){
			double a,b,c,d,e,f;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			
			double x=new BigDecimal((c*e-b*f)/(a*e-b*d))
				.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
			double y=new BigDecimal((c*d-a*f)/(b*d-a*e))
				.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
			ln(String.format("%.3f %.3f",x,y));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}