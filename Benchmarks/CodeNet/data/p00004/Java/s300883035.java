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
			
			double x = (e*c - b*f)/(a*e - d*b);
			double y = (d*c - a*f)/(b*d - a*e);
			System.out.printf("%.3f %.3f\n",x,y);
		}
		
	}
}