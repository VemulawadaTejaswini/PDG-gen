import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int e = s.nextInt();
			int f = s.nextInt();
			
			double x = (double)(e*c - b*f)/(double)(a*e - d*b);
			double y = (double)(d*c - a*f)/(double)(b*d - a*e);
			System.out.printf("%.3f %.3f\n",x,y);
		}
		
	}
}