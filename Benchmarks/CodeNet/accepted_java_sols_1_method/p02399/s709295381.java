import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int d = 0,r = 0;
		double f =0.0;
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
		 int b = sc.nextInt();
		 d = a / b;
		 r = a % b;
		 f = 1.0 * a / b;
		 System.out.println(String.format("%d %d %f",d,r,f));
	}
}
