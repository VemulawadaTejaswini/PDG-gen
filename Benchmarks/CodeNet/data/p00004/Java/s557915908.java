import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		double a,b,c,d,e,f;

		double x,y;
	
		while(s.hasNext()){
			 a = s.nextInt();
			 b = s.nextInt();
			 c = s.nextInt();
			 d = s.nextInt();
			 e = s.nextInt();
			 f = s.nextInt();
			
			 y = (c*d-f*a)/(b*d-e*a);
			 x = (c-b*y)/a;
			 System.out.printf("%.3f %.3f\n",x,y);

			
		}
		


	}
}